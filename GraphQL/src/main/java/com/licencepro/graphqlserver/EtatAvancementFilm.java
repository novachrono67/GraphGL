package com.licencepro.graphqlserver;

public enum EtatAvancementFilm
{
    EN_COURS_DE_REALISATION("En cours de réalisation"),
    SORTIE("Sortie"),
    PROJET_ABANDONNE("Projet abandonné");

    private String etat;

    private EtatAvancementFilm(String etat)
    {
        this.etat = etat;
    }

    public String getEtat()
    {
        return this.etat;
    }
}
