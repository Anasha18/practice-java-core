package org.java.core.lesson4.edo.repository;

import org.java.core.lesson4.edo.domain.Document;
import org.java.core.lesson4.edo.exception.DocumentException;

import java.util.*;

public class DocumentRepository {
    private final Map<UUID, Document> documents = new HashMap<>();

    public DocumentRepository() {
    }

    public void save(Document document) {
        documents.put(document.getId(), document);
    }

    public List<Document> findAll() {
        return new ArrayList<>(documents.values());
    }

    public boolean existsById(UUID id) {
        return documents.containsKey(id);
    }

    public Document findById(UUID id) {
        var document = documents.get(id);

        if (document == null) {
            throw new DocumentException(id);
        }

        return document;
    }

    public int size() {
        return documents.size();
    }
}
