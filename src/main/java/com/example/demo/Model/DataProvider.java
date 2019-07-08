package com.example.demo.Model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DataProvider {
    private static ArrayList<Music> allMusic;
    private static ArrayList<Genre> allGenres;
    private static ArrayList<Artist> allArtist;
    private static ArrayList<User> allUsers;
    private static ArrayList<String> validUsername;

    public DataProvider() {
        allMusic = new ArrayList<>();
        allGenres = new ArrayList<>();
        allArtist = new ArrayList<>();
        allUsers = new ArrayList<>();
        validUsername = new ArrayList<>();
        initialize();
    }


    public void initialize() {

        allUsers.add(new User("tien", "Tien12345", "Tien", "Thai", "460592@student.saxion.nl"));
        allUsers.add(new User("alex", "Alex12345", "Alex", "Trifonov", "alex@email.com"));


        Genre alternative = new Genre("Alternatives", "A less intense version of rock " +
                "and a more intense version of pop. Typically strays from the generic lyrics of pop.", "alternative.jpg");
        Genre classical = new Genre("Classical", "Classical music is a tricky genre, mainly because to the uninformed everything before jazz sounds like it!", "classical.jpg");
        Genre country = new Genre("Country", "a style and genre of largely string-accompanied American popular music having roots in the folk music of the Southeast and cowboy music of the West, usually vocalized, generally simple in form and harmony," +
                " and typidied by romantic or melancholy ballads accompanied by acoustic or electric guitar, banjo, violin, and harmonica.", "country.jpg");
        Genre electronic = new Genre("Electronic", "EDM–electronic dance music–is super en vogue at the moment, with artists like Daft Punk and Deadmau5 bringing it out of the shadows and into the pop flow, but it’s not even remotely new. ", "electronic.jpg");
        Genre pop = new Genre("Pop", "The main medium of pop music is the song, often between two and a half and three and a half minutes in length, generally marked by a consistent and noticeable rhythmic element, a mainstream style and a simple traditional structure. Common variants include the verse-chorus form and the thirty-two-bar form, with a focus on melodies and catchy hooks, and a chorus that contrasts melodically, " +
                "rhythmically and harmonically with the verse.", "pop.jpg");

        Genre jazz = new Genre("Jazz", "Jazz is a music genre that originated in the African-American communities of New Orleans, United States. [1] It originated in the late 19th and early 20th centuries, and developed from roots in blues and ragtime.[2] Jazz is seen by many as America's classical music", "jazz.jpg");

        Genre rb = new Genre("R&B", "Rhythm and blues, commonly abbreviated as R&B, is a genre of popular music that originated in African American communities in the 1940s.[1] The term was originally used by record companies to describe recordings marketed predominantly to urban African Americans, at a time when urbane, rocking, jazz based music with a heavy, insistent beat was becoming more popular.", "rb.jpg");

        Genre soul = new Genre("Soul", "is a popular music genre that originated in the African American community in the United States in the 1950s and early 1960s. It combines elements of African-American gospel music, rhythm and blues and jazz", "soul.jpg");

        Genre experimental = new Genre("Experimental", "Experimental music is a general label for any music that pushes existing boundaries and genre definitions", "hiphop.jpg");
        Genre deathCore = new Genre("Deathcore", "Deathcore is an extreme metal fusion genre that combines musical elements of death metal and metalcore and sometimes hardcore punk.", "spoken.jpg");

        addGenre(alternative);
        addGenre(classical);
        addGenre(country);
        addGenre(electronic);
        addGenre(jazz);
        addGenre(rb);
        addGenre(pop);
        addGenre(soul);
        addGenre(experimental);
        addGenre(deathCore);


        Artist artist1 = new Artist("Slice The Cake", "none", "Brington, Uk", "Uk", 2015, "none", "slice.jpg");
        Artist artist2 = new Artist("Ed Sheeran", "Angelo Mysterioso", "Framlingham, Suffolk, England", "17 February 1991", 2004, "Asylum, Atlantic, Elektra", "edd.jpg");
        Artist artist3 = new Artist("Adele", "Adele Laurie Blue Adkins", "Tottenham, London, England, United Kingdom", "1988", 2006, "XL, Columbia", "ade.jpg");
        Artist artist4 = new Artist("Hardwell", "Robbert van de Corput", "Breda, North Brabant, Netherlands", "1988", 2002, "Revealed,Musical Freedom,Ultra,Mainstage,Epic Amsterdam,Sony,Universal,Armada,Spinnin", "hardwell.jpg");
        Artist artist5 = new Artist("Avicii", "Tim Bergling", "Stockholm, Sweden", "1989", 2006, "Geffen, Island Def Jam", "avicii.jpg");
        Artist artist6 = new Artist("Aurora", "none", "Os, Norway", "15 June 1996", 2012, "Glassnote Records, Decca Records", "aurora.jpg");
        Artist artist7 = new Artist("Gautier Serre", "Igorrr", "France", "June 5, 1984", 2005, "Ad Noiseam, Metal Blade, Blood Music", "gautie.jpg");

        Album odyssey1 = new Album("Odyssey to the West", 2016, artist1, deathCore, "odse.jpg");
        Album divide = new Album("Divide", 2017, artist2, pop, "divide.png");
        Album ade25 = new Album("25", 2015, artist3, pop, "adel25.png");
        Album auro1 = new Album("Infections Of A Different Kind - Step 1", 2018, artist6, pop, "infec.jpg");
        Album savage = new Album("Savage Sinusoid", 2017, artist7, experimental, "savage.jpg");
        Album albumTrue = new Album("True", 2013, artist5, electronic, "true.png");
        Album united = new Album("United we are", 2015, artist4, electronic, "united.jpg");

        Single hello = new Single("Hello", 2015, artist3, soul, "Digital Download", "hello.png", 4.55);
        Single make = new Single("Make you feel my love", 2008, artist3, soul, "Digital Download", "make.jpg", 3.32);

        addAlbum(odyssey1);
        addAlbum(divide);
        addAlbum(ade25);
        addAlbum(auro1);
        addAlbum(savage);
        addAlbum(albumTrue);
        addAlbum(united);
        addSingle(hello);
        addSingle(make);

        addArtist(artist1);
        addArtist(artist2);
        addArtist(artist3);
        addArtist(artist4);
        addArtist(artist5);
        addArtist(artist6);
        addArtist(artist7);

        addSongToAlbum(new Song("The Exile Part I - The Razor's Edge", 4.14), odyssey1);
        addSongToAlbum(new Song("The Exile Part II - The City of Destruction", 5.24), odyssey1);
        addSongToAlbum(new Song("Stone and Silver Part I - The Mountains of Man", 8.16), odyssey1);
        addSongToAlbum(new Song("Stone and Silver Part II - The Horned God", 2.32), odyssey1);
        addSongToAlbum(new Song("Stone and Silver Part III - The Man of Papyrus Limbs", 5.44), odyssey1);
        addSongToAlbum(new Song("Westward Bound Part I - The Lantern", 6.15), odyssey1);
        addSongToAlbum(new Song("Westward Bound Part II - The Pilgrim's Progress", 4.04), odyssey1);
        addSongToAlbum(new Song("Castle in the Sky Part II - Pieces of Ruins", 4.50), odyssey1);
        addSongToAlbum(new Song("Unending Waltz", 2.4), odyssey1);

        addSongToAlbum(new Song("Eraser", 3.47), divide);
        addSongToAlbum(new Song("Dive", 3.58), divide);
        addSongToAlbum(new Song("Dive", 3.58), divide);
        addSongToAlbum(new Song("Supermarket Flowers", 3.53), divide);
        addSongToAlbum(new Song("Shape Of You", 3.41), divide);
        addSongToAlbum(new Song("How Would You Feel", 4.40), divide);
        addSongToAlbum(new Song("Galway Girl", 2.50), divide);
        addSongToAlbum(new Song("Perfect", 3.27), divide);
        addSongToAlbum(new Song("Happier", 2.4), divide);

        addSongToAlbum(new Song("Hello", 4.55), ade25);
        addSongToAlbum(new Song("Send My Love (To your new lover)", 3.43), ade25);
        addSongToAlbum(new Song("When we were young", 5.48), ade25);
        addSongToAlbum(new Song("Remedy", 4.05), ade25);
        addSongToAlbum(new Song("Water under the bridge", 4.00), ade25);
        addSongToAlbum(new Song("Million years ago", 4.46), ade25);
        addSongToAlbum(new Song("All I ask", 4.32), ade25);

        addSongToAlbum(new Song("Queendom", 3.27), auro1);
        addSongToAlbum(new Song("Forgotten Love", 3.28), auro1);
        addSongToAlbum(new Song("Gentle Earthquakes", 3.47), auro1);
        addSongToAlbum(new Song("All Is Soft Inside", 5.09), auro1);
        addSongToAlbum(new Song("It Happened Quiet", 4.09), auro1);
        addSongToAlbum(new Song("Churchyard", 3.46), auro1);
        addSongToAlbum(new Song("Soft Universe", 4.00), auro1);
        addSongToAlbum(new Song("Infections of a Different Kind", 5.27), auro1);


        addSongToAlbum(new Song("Viande", 1.55), savage);
        addSongToAlbum(new Song("ieuD", 3.55), savage);
        addSongToAlbum(new Song("Houmous", 3.31), savage);
        addSongToAlbum(new Song("Opus Brain", 5.25), savage);
        addSongToAlbum(new Song("Problème d'émotion", 4.32), savage);
        addSongToAlbum(new Song("Spaghetti Forever", 4.24), savage);
        addSongToAlbum(new Song("Cheval", 3.06), savage);
        addSongToAlbum(new Song("Apopathodiaphulatophobie", 2.02), savage);
        addSongToAlbum(new Song("Va te foutre", 1.45), savage);
        addSongToAlbum(new Song("Robert", 3.19), savage);

        addSongToAlbum(new Song("Wake Me Up", 4.09), albumTrue);
        addSongToAlbum(new Song("You Make Me", 3.53), albumTrue);
        addSongToAlbum(new Song("Hey Brother", 4.14), albumTrue);
        addSongToAlbum(new Song("Addicted to You", 2.28), albumTrue);
        addSongToAlbum(new Song("Dear Boy", 7.59), albumTrue);
        addSongToAlbum(new Song("Liar Liar", 3.58), albumTrue);
        addSongToAlbum(new Song("Shame on Me", 4.13), albumTrue);
        addSongToAlbum(new Song("Lay Me Down", 5.00), albumTrue);
        addSongToAlbum(new Song("Hope There's Someone", 6.21), albumTrue);
        addSongToAlbum(new Song("Heart Upon My Sleeve", 4.40), albumTrue);

        addSongToAlbum(new Song("Eclipse", 3.12), united);
        addSongToAlbum(new Song("Follow Me", 3.19), united);
        addSongToAlbum(new Song("Sally", 4.08), united);
        addSongToAlbum(new Song("Let Me Be Your Home", 3.35), united);
        addSongToAlbum(new Song("Colors", 4.00), united);
        addSongToAlbum(new Song("Where Is Here Now", 3.15), united);
        addSongToAlbum(new Song("United We Are", 5.51), united);
        addSongToAlbum(new Song("Don't Stop the Madness", 3.45), united);
        addSongToAlbum(new Song("Young Again", 3.39), united);
        addSongToAlbum(new Song("Echo", 5.08), united);
        addSongToAlbum(new Song("Arcadia", 3.13), united);
        addSongToAlbum(new Song("Area 51", 3.00), united);
        addSongToAlbum(new Song("Nothing Can Hold Us Down", 3.18), united);


        addArtistToGenre(artist1, deathCore);
        addArtistToGenre(artist2, pop);
        addArtistToGenre(artist3, pop);
        addArtistToGenre(artist3, rb);
        addArtistToGenre(artist4, electronic);
        addArtistToGenre(artist5, electronic);
        addArtistToGenre(artist6, pop);
        addArtistToGenre(artist7, experimental);
        addArtistToGenre(artist7, classical);
        addArtistToGenre(artist7, electronic);

        addMusicToGenre(odyssey1, deathCore);
        addMusicToGenre(divide, pop);
        addMusicToGenre(ade25, pop);
        addMusicToGenre(ade25, rb);
        addMusicToGenre(ade25, soul);
        addMusicToGenre(auro1, pop);
        addMusicToGenre(savage, experimental);
        addMusicToGenre(savage, jazz);
        addMusicToGenre(albumTrue, electronic);
        addMusicToGenre(united, electronic);
        addMusicToGenre(hello, soul);
        addMusicToGenre(make, soul);
        addMusicToGenre(make, pop);

        addGenresToArtist(deathCore, artist1);
        addGenresToArtist(pop, artist2);
        addGenresToArtist(pop, artist3);
        addGenresToArtist(rb, artist3);
        addGenresToArtist(soul, artist3);
        addGenresToArtist(electronic, artist4);
        addGenresToArtist(electronic, artist5);
        addGenresToArtist(pop, artist6);
        addGenresToArtist(experimental, artist7);
        addGenresToArtist(electronic, artist7);
        addGenresToArtist(classical, artist7);

        addAlbumToArtist(odyssey1, artist1);
        addAlbumToArtist(divide, artist2);
        addAlbumToArtist(ade25, artist3);
        addAlbumToArtist(auro1, artist6);
        addAlbumToArtist(savage, artist7);
        addAlbumToArtist(albumTrue, artist5);
        addAlbumToArtist(united, artist4);
        addSingleToArtist(hello, artist3);
        addSingleToArtist(make, artist3);

        addUserNameValid();
    }

    public ArrayList<Music> getMusic() {
        return allMusic;
    }// this method is called to connect front and back

    public ArrayList<Artist> getAllArtist() {
        return allArtist;
    }// this method is called to connect front and back

    public ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public Music findMusicByName(String name) {
        try {
            for (Music music : allMusic) {
                if (music.getTitle().equalsIgnoreCase(name.trim())) {
                    return music;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public void addUserNameValid() {
        for (User user : allUsers) {
            validUsername.add(user.getUsername());
        }
    }


    //this method will be called to search
    public Artist findArtistByName(String name) {
        for (Artist artist : allArtist) {
            if (artist.getName().equalsIgnoreCase(name)) {
                return artist;
            }
        }
        return null;
    }

    public Genre findGenreByName(String name) {
        for (Genre genre : allGenres) {
            if (genre.getName().equalsIgnoreCase(name)) {
                return genre;
            }
        }
        return null;
    }


    public void addAlbum(Album album) {
        allMusic.add(album);
    }


    public void addSingle(Single single) {
        allMusic.add(single);
    }


    public void addSongToAlbum(Song song, Album album) {
        album.addSong(song);
    }

    public void addGenre(Genre genre) {
        allGenres.add(genre);
    }

    public void addArtist(Artist artist) {
        allArtist.add(artist);
    }


    private void addAlbumToArtist(Album album, Artist artist) {
        artist.addAlbum(album);
    }

    private void addSingleToArtist(Single single, Artist artist) {
        artist.addSingle(single);
    }

    private void addMusicToGenre(Music music, Genre genre) {
        genre.addMusic(music);
    }

    private void addArtistToGenre(Artist artist, Genre genre) {
        genre.addArtist(artist);
    }

    public ArrayList<Genre> getGenreByPos(int numberofColumn, int pos) {
        ArrayList<Genre> genreArrayList = new ArrayList<>();
        for (int i = 0; i < allGenres.size(); i++) {
            if (i % numberofColumn == pos) {
                genreArrayList.add(allGenres.get(i));
            }
        }
        return genreArrayList;
    }

    public ArrayList<Artist> getArtistByPos(int numberofColumn, int pos) {
        ArrayList<Artist> artistArrayList = new ArrayList<>();
        for (int i = 0; i < allArtist.size(); i++) {
            if (i % numberofColumn == pos) {
                artistArrayList.add(allArtist.get(i));
            }
        }
        return artistArrayList;
    }

    public void addGenresToArtist(Genre genre, Artist artist) {
        artist.addGenre(genre);
    }

    public ArrayList<Music> searchMusicByName(String name) {
        ArrayList<Music> searchResult = new ArrayList<>();
        Music music = findMusicByName(name);
        if (music != null) {
            searchResult.add(music);
        }

        return searchResult;
    }


    public ArrayList<String> getValidUser() {
        return validUsername;
    }

    public User findUserByUserName(String username) {
        for (User user : allUsers) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        return null;
    }

}

