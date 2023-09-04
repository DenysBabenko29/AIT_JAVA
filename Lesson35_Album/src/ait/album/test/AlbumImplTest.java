package ait.album.test;

import ait.album.dao.Album;
import ait.album.dao.AlbumImpl;
import ait.album.model.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {
    Album albums;
    LocalDateTime now = LocalDateTime.now();
    Photo[] ph = new Photo[6];


    @BeforeEach
    void setUp() {
        albums = new AlbumImpl(7);
        ph[0] = new Photo(1, 1, "title1", "url1", now.minusDays(7));
        ph[1] = new Photo(1, 2, "title2", "url1", now.minusDays(7));
        ph[2] = new Photo(1, 3, "title3", "url1", now.minusDays(5));
        ph[3] = new Photo(2, 1, "title1", "url1", now.minusDays(7));
        ph[4] = new Photo(2, 4, "title4", "url4", now.minusDays(2));
        ph[5] = new Photo(1, 4, "title4", "url1", now.minusDays(2));
        for (int i = 0; i < ph.length; i++) {
            albums.addPhoto(ph[i]);
        }

    }

    @Test
    void addPhoto() {
        assertFalse(albums.addPhoto(null));
        assertFalse(albums.addPhoto(ph[1]));
        Photo photo = new Photo(1, 5, "title7", "url7", now.minusDays(3));
        assertTrue(albums.addPhoto(photo));
        assertEquals(7, albums.size());
        photo = new Photo(1, 6, "title8", "url8", now.minusDays(3));
        assertFalse(albums.addPhoto(photo));
    }

    @Test
    void removePhoto() {
        assertFalse(albums.removePhoto(5, 1));
        assertTrue(albums.removePhoto(1, 1));
        assertEquals(5, albums.size());
        assertNull(albums.getPhotoFromAlbum(1, 1));
    }

    @Test
    void updatePhoto() {
        assertTrue(albums.updatePhoto(1, 1, "newUrl"));
        assertEquals("newUrl", albums.getPhotoFromAlbum(1, 1). getUrl());

    }

    @Test
    void getPhotoFromAlbum() {
        assertNull(albums.getPhotoFromAlbum(12, 2));
        assertEquals(ph[0], albums.getPhotoFromAlbum(1, 1));
    }

    @Test
    void getAllPhotoFromAlbum() {
        Photo[] expected = {ph[3], ph[4]};
        Photo[] actual = albums.getAllPhotoFromAlbum(2);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void getPhotoBeetwenDate() {
        LocalDate ld = now.toLocalDate();
        Photo[] actual = albums.getPhotoBeetwenDate(ld.minusDays(5), ld.minusDays(2));
        Arrays.sort(actual);
        Photo[] expected = {ph[2], ph[5], ph[4]};
        assertArrayEquals(expected, actual);
    }
}