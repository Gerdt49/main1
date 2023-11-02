package practice.HW_40.Documents.dao;

import practice.Album.model.Photo;
import practice.HW_40.Documents.Documents;

import javax.swing.text.Document;
import java.time.LocalDate;

public interface Archive {
    /*boolean addPhoto (Photo photo);
    boolean removePhoto(int photoId, int albumId);
    boolean updatePhoto(int photoId, int albumId,String url);
    Photo getPhotoFromAlbum(int photoId, int albumId);
    Photo[]  getAlPhotoFromAlbum(int albumId);
    Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();*/

    boolean addDocument(Documents documents);

    boolean removeDocument(int folderId, int documentId);

    boolean updateDocument(int folderId, int documentId, String url);

    Document getDocumentFromArchive(int folderId, int documentId);

    Document[] getAlDocumentFromArchive(int documentId);
    Document[] get


}
