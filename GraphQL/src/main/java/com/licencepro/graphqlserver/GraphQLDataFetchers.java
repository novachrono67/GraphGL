package com.licencepro.graphqlserver;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class GraphQLDataFetchers {

    private static List<Map<String, String>> films = Arrays.asList(
            new ImmutableMap.Builder<String, String>()
                    .put("id", "film-1")
                    .put("titreFrancais", "OSS 117 : Alert rouge en Afrique noire")
                    .put("titreOriginal", "The Godfather")
                    .put("dateDeSortie", "18 octobre 1972")
                    .put("realisateur", "realisateur-1")
                    .put("listeActeurs", "acteur-1")
                    .put("etatAvencementFilm", "Sorti").build(),
            new ImmutableMap.Builder<String, String>()
                    .put("id", "film-2")
                    .put("titreFrancais", "OSS 117 : Alert rouge en Afrique noire")
                    .put("titreOriginal", "OSS 117 : Alert rouge en Afrique noire")
                    .put("dateDeSortie", "")
                    .put("realisateur", "realisateur-2")
                    .put("listeActeurs", "acteur-4")
                    .put("etatAvencementFilm", "En cours de réalisation").build()
    );

    private static List<Map<String, String>> realisateurs = Arrays.asList(
            new ImmutableMap.Builder<String, String>()
                    .put("id", "realisateur-1")
                    .put("nom", "Ford Coppola")
                    .put("prenom", "Francis")
                    .put("dateDeNaissance", "7 avril 1939")
                    .put("dateDeMort", "").build(),
            new ImmutableMap.Builder<String, String>()
                    .put("id", "realisateur-2")
                    .put("nom", "Bedos")
                    .put("prenom", "Nicolas")
                    .put("dateDeNaissance", "21 avril 1979")
                    .put("dateDeMort", "").build()
    );

    private static List<Map<String, String>> acteurs = Arrays.asList(
            new ImmutableMap.Builder<String, String>()
                    .put("id", "acteur-1")
                    .put("nom", "Brando")
                    .put("prenom", "Marlon")
                    .put("dateDeNaissance", "1965")
                    .put("dateDeMort", "").build(),
            new ImmutableMap.Builder<String, String>()
                    .put("id", "acteur-2")
                    .put("nom", "Pacino")
                    .put("prenom", "Al")
                    .put("dateDeNaissance", "1965")
                    .put("dateDeMort", "").build(),
            new ImmutableMap.Builder<String, String>()
                    .put("id", "acteur-3")
                    .put("nom", "Duvall")
                    .put("prenom", "Robert")
                    .put("dateDeNaissance", "1965")
                    .put("dateDeMort", "").build(),
            new ImmutableMap.Builder<String, String>()
                    .put("id", "acteur-4")
                    .put("nom", "Dujardin")
                    .put("prenom", "Jean")
                    .put("dateDeNaissance", "1965")
                    .put("dateDeMort", "").build(),
            new ImmutableMap.Builder<String, String>()
                    .put("id", "acteur-5")
                    .put("nom", "Niney")
                    .put("prenom", "Pierre")
                    .put("dateDeNaissance", "1965")
                    .put("dateDeMort", "").build()

    );

    public DataFetcher getFilmByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String filmId = dataFetchingEnvironment.getArgument("id");
            return films
                    .stream()
                    .filter(film -> film.get("id").equals(filmId))
                    .findFirst()
                    .orElse(null);
        };
    }

    public DataFetcher getRealisateurDataFetcher() {
        return dataFetchingEnvironment -> {
            Map<String, String> film = dataFetchingEnvironment.getSource();
            String realisateurId = film.get("realisateur");
            return realisateurs
                    .stream()
                    .filter(realisateur -> realisateur.get("id").equals(realisateurId))
                    .findFirst()
                    .orElse(null);
        };
    }

    public DataFetcher getActeurDataFetcher() {
        return dataFetchingEnvironment -> {
            Map<String, String> film = dataFetchingEnvironment.getSource();
            String acteurId = film.get("listeActeurs");
            return acteurs
                    .stream()
                    .filter(acteur -> acteur.get("id").equals(acteurId))
                    .findFirst()
                    .orElse(null);
        };
    }

    public DataFetcher getRealisateurByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String realisateurId = dataFetchingEnvironment.getArgument("id");
            return realisateurs
                    .stream()
                    .filter(realisateur -> realisateur.get("id").equals(realisateurId))
                    .findFirst()
                    .orElse(null);
        };
    }

    public DataFetcher getActeurByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String acteurId = dataFetchingEnvironment.getArgument("id");
            return acteurs
                    .stream()
                    .filter(acteur -> acteur.get("id").equals(acteurId))
                    .findFirst()
                    .orElse(null);
        };
    }
}