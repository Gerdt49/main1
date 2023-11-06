package practice.HW_40.Archive;

import java.time.LocalDateTime;
import java.util.Objects;

public class Documents implements Comparable<Documents>{

    private  int folderId;
    private int documentId;
    private  String name;
     private String Url;
    private String DateDocument;

    public Documents(int folderId, int documentId, String name, String url, LocalDateTime dateDocument) {
        this.folderId = folderId;
        this.documentId = documentId;
        this.name = name;
        Url = url;
        DateDocument = dateDocument;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getDateDocument() {
        return DateDocument;
    }

    public void setDateDocument(String dateDocument) {
        DateDocument = dateDocument;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "folderId=" + folderId +
                ", documentId=" + documentId +
                ", name='" + name + '\'' +
                ", Url='" + Url + '\'' +
                ", DateDocument='" + DateDocument + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Documents documents = (Documents) object;
        return folderId == documents.folderId && documentId == documents.documentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId, documentId);
    }

    @Override
    public int compareTo(Documents o) {
        int res = Integer.compare(folderId,o.folderId);
        return res != 0 ? res : Integer.compare(documentId,o.documentId);

    }
}
