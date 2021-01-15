package com.licencepro.graphqlserver;

import java.util.ArrayList;
import java.util.Date;

public class Film
{
    private String id;
    private String titreFrancais;
    private String titreOriginal;
    private String dateDeSortie;
    private String realisateur;
    private String[] listeActeurs;
    private EtatAvancementFilm etatAvancementFilm;

    public Film(String id, String titreFrancais, String titreOriginal, String dateDeSortie, String realisateur, String[] listeActeurs, EtatAvancementFilm etatAvancementFilm)
    {
        this.id = id;
        this.titreFrancais = titreFrancais;
        this.titreOriginal = titreOriginal;
        this.dateDeSortie = dateDeSortie;
        this.realisateur = realisateur;
        this.listeActeurs = listeActeurs;
        this.etatAvancementFilm = etatAvancementFilm;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitreFrancais()
    {
        return titreFrancais;
    }

    public void setTitreFrancais(String titreFrancais)
    {
        this.titreFrancais = titreFrancais;
    }

    public String getTitreOriginal()
    {
        return titreOriginal;
    }

    public void setTitreOriginal(String titreOriginal)
    {
        this.titreOriginal = titreOriginal;
    }

    public String getDateDeSortie()
    {
        return dateDeSortie;
    }

    public void setDateDeSortie(String dateDeSortie)
    {
        this.dateDeSortie = dateDeSortie;
    }

    public String getRealisateur()
    {
        return realisateur;
    }

    public void setRealisateur(String realisateur)
    {
        this.realisateur = realisateur;
    }

    public String[] getListeActeurs()
    {
        return listeActeurs;
    }

    public void setListeActeurs(String[] listeActeurs)
    {
        this.listeActeurs = listeActeurs;
    }

    public EtatAvancementFilm getEtatAvancementFilm()
    {
        return etatAvancementFilm;
    }

    public void setEtatAvancementFilm(EtatAvancementFilm etatAvancementFilm)
    {
        this.etatAvancementFilm = etatAvancementFilm;
    }
}
