//package com.tecnidev.feedmeapp.interfaz;

import java.util.List;

public interface InicioInterface {

    interface  View {

         void mostrarLista( List<Object>  publicaciones );
         Boolean respuestaSalirApp();

    }

    interface  Controlador {
        void recuperarLista();
        void salirApp();

    }

    interface Modelo{

    }
}
