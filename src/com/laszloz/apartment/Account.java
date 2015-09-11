package com.laszloz.apartment;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int ID;
	private List<Document> documents = new ArrayList<Document>();

	public void addDocument(Document document) {
		documents.add(document);
	}

	public Document getDocument(int documentNumber) {
		for (Document document : documents) {
			if (document.getDocumentNumber() == documentNumber)
				return document;
		}
		return null;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}
