/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samer
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        Grafos mapa = new Grafos();        
        BuscaGulosa gulosa = new BuscaGulosa(mapa.bucharest);

        gulosa.buscaRecursiva(mapa.arad);       
    }
}
