/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Anime;
import datos.AnimeDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class AnimeServiceImpl implements AnimeService {
    
    @Inject  
    private AnimeDao InterfazAnime;
    
    
        
    @Override
    public List<Anime> listarAnimes() {       
        return InterfazAnime.findAllAnimes();
    }
    
    @Override
   public Anime encontrarAnimePorID(Anime anime){
       return InterfazAnime.findAnimeByID(anime);
   }
    
   @Override
    public Anime econtrarAnimePorNombre(Anime anime){
        return InterfazAnime.findAnimeByName(anime);
    }
    
    @Override
    public Anime econtrarAnimePorIdioma(Anime anime){
        return InterfazAnime.findAnimeByLanguage(anime);
    }
    
    @Override
    public void registrarAnime(Anime anime){
         InterfazAnime.insert(anime);
    }
    
    @Override
    public void modificarAnime(Anime anime){
        InterfazAnime.updateAnime(anime);
    }
    
    @Override
    public void eliminarAnime(Anime anime){
        InterfazAnime.deleteAnime(anime);
    }
}
