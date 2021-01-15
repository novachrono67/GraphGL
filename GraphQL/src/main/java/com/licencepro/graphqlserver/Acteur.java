package com.licencepro.graphqlserver;

import java.util.Date;
import java.util.Map;

public class Acteur
{
    private String id;
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String dateDeMort;

    public Acteur(String id, String nom, String prenom, String dateDeNaissance, String dateDeMort)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.dateDeMort = dateDeMort;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getDateDeNaissance()
    {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance)
    {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getDateDeMort()
    {
        return dateDeMort;
    }

    public void setDateDeMort(String dateDeMort)
    {
        this.dateDeMort = dateDeMort;
    }
}
