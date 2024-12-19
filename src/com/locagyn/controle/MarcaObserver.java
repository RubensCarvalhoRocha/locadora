package com.locagyn.controle;

import com.locagyn.modelos.Marca;
import java.util.ArrayList;

public interface MarcaObserver {
    void atualizarListaDeMarcas(ArrayList<Marca> marcas);
}
