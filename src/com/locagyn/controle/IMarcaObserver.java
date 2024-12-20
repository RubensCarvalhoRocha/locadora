package com.locagyn.controle;

import com.locagyn.modelos.Marca;
import java.util.ArrayList;

public interface IMarcaObserver {
    void atualizarListaDeMarcas(ArrayList<Marca> marcas);
}
