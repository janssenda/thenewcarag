package com.dm.model;

import java.util.Arrays;
import java.util.List;

public class Headquarters {

    private String headQID;
    private String headQName;
    private String headQAdress;
    private String description;
    private List<Contact> contactList;

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public String getHeadQID() {
        return headQID;
    }

    public void setHeadQID(String headQID) {
        this.headQID = headQID;
    }

    public String getHeadQName() {
        return headQName;
    }

    public void setHeadQName(String headQName) {
        this.headQName = headQName;
    }

    public String getHeadQAdress() {
        return headQAdress;
    }

    public void setHeadQAdress(String headQAdress) {
        this.headQAdress = headQAdress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Headquarters that = (Headquarters) o;

        if (headQID != null ? !headQID.equals(that.headQID) : that.headQID != null) return false;
        if (headQName != null ? !headQName.equals(that.headQName) : that.headQName != null) return false;
        if (headQAdress != null ? !headQAdress.equals(that.headQAdress) : that.headQAdress != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        return contactList != null ? contactList.equals(that.contactList) : that.contactList == null;
    }

    @Override
    public int hashCode() {
        int result = headQID != null ? headQID.hashCode() : 0;
        result = 31 * result + (headQName != null ? headQName.hashCode() : 0);
        result = 31 * result + (headQAdress != null ? headQAdress.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (contactList != null ? contactList.hashCode() : 0);
        return result;
    }
}