package practice.HW_40.Archive.dao;

import practice.Album.model.Photo;
import practice.HW_40.Archive.Documents;

import javax.swing.text.Document;
import java.time.LocalDate;
import java.util.Comparator;

public class ArchiveImpl implements Archive{
    static Comparator<Documents> comparator = (p1, p2) -> {
        int res = p1.getDateDocument().compareTo(p2.getDateDocument()); // date field
        return res != 0 ? res : Integer.compare(p1.getDocumentId(), p2.getDocumentId()); // photoId field
    };
    private Documents[] documents;
    private int size;

    public ArchiveImpl(int capacity){
            documents = new Documents[capacity];
    }

    @Override
    public boolean addDocument(Documents documents) {

        return false;
    }

    @Override
    public boolean removeDocument(int folderId, int documentId) {
        return false;
    }

    @Override
    public boolean updateDocument(int folderId, int documentId, String url) {
        return false;
    }

    @Override
    public Document getDocumentFromArchive(int folderId, int documentId) {
        return null;
    }

    @Override
    public Document[] getAllDocumentFromArchive(int documentId) {
        return new Document[0];
    }

    @Override
    public Document[] getAllDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Document[0];
    }

    @Override
    public int size() {
        return 0;
    }

}
