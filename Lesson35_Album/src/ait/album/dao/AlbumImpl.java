package ait.album.dao;

import ait.album.model.Photo;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album {
    static Comparator<Photo> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate());
        return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };
    Photo[] photos;
    int size;

    public AlbumImpl(int capacity) {  // создаем массив фотографий размером capacity
        photos = new Photo[capacity];
    }

    @Override
    public boolean addPhoto(Photo photo) {
        if (photo == null || size == photos.length || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumID()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(photos, 0, size, photo, comparator);
        index = index >= 0 ? index : - index - 1;
        System.arraycopy(photos, index, photos, index + 1, size - index);
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        if (getPhotoFromAlbum(photoId, albumId) == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumID() == albumId){
                System.arraycopy(photos, i + 1, photos, i, size - i - 1);
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(albumId, photoId);
        if (photo == null){
            return false;
        }
        photo.setUrl(url);
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null);
        for (int i = 0; i < size; i++) {
            if (pattern.equals(photos[i])) {
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return findyPredicate(p -> p.getAlbumID() == albumId);
    }

    @Override
    public Photo[] getPhotoBeetwenDate(LocalDate dateFrom, LocalDate dateTo) {
        Photo pattern = new Photo(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay());
        int from = -Arrays.binarySearch(photos, 0, size, pattern, comparator) - 1;
       // from = from >= 0 ? from : -from - 1;
        pattern = new Photo(0, Integer.MAX_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX));
        int to = -Arrays.binarySearch(photos, 0, size, pattern, comparator) - 1;
       // to = to >= 0 ? to : -to -1;
        return Arrays.copyOfRange(photos, from, to);


      //  return findyPredicate(p -> p.getDate().toLocalDate().compareTo(dateFrom) >= 0 && p.getDate().toLocalDate().compareTo(dateTo) <= 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AlbumImpl{");
        sb.append("photos=").append(Arrays.toString(photos));
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

    private Photo[] findyPredicate(Predicate<Photo> predicate){
        Photo[] resArray = new Photo[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(photos[i])) {
                resArray[j++] = photos[i];
            }
        }
        return Arrays.copyOf(resArray, j);
    }
}
