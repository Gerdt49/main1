package practice.Album.dao;

import practice.Album.model.Photo;

import java.time.LocalDate;

public interface Album {
    boolean addPhoto (Photo photo);
    boolean removePhoto(int photoId, int albumId);

    boolean updatePhoto(int photoId, int albumId,String url);

    Photo getPhotoFromAlbum(int photoId, int albumId);
    Photo[]  getAlPhotoFromAlbum(int albumId);
    Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();



}