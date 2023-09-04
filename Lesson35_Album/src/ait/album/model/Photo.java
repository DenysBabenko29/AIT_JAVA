package ait.album.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Photo implements Comparable<Photo>{
    private int albumID;
    private int photoId;
    private String title;
    private String url;
    private LocalDateTime date;

    public Photo(int albumID, int photoId, String title, String url, LocalDateTime date) {
        this.albumID = albumID;
        this.photoId = photoId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getAlbumID() {
        return albumID;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Photo{");
        sb.append("albumID=").append(albumID);
        sb.append(", photoId=").append(photoId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return albumID == photo.albumID && photoId == photo.photoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumID, photoId);
    }

    @Override
    public int compareTo(Photo o) {
        int res = Integer.compare(albumID, o.albumID);
        return res != 0 ? res : Integer.compare(photoId, o.photoId);
    }
}
