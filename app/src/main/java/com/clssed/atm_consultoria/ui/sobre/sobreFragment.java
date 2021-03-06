package com.clssed.atm_consultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.clssed.atm_consultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link sobreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class sobreFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public sobreFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment sobreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static sobreFragment newInstance(String param1, String param2) {
        sobreFragment fragment = new sobreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_sobre, container, false);

        String descricao = "Este app foi desenvolvido por Edmilson Santos, engenheiro eletr??nico e desenvolvedor " +
                "mobile com conhecimentos em Java, Kotlin, React-Native e flutter";

        Element vers??o = new Element();
        vers??o.setTitle("Vers??o 1.0");

        return new AboutPage(getContext())
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Entre em contato:")
                .addEmail("edmilsonclss@gmail.com", "Envie um e-mail para o desenvolvedor deste App!")
                .addGroup("Redes sociais")
                .addGitHub("ClssEdmilson","Visite o GitHub do desenvolvedor deste App!")
                .addWebsite("https://www.linkedin.com/in/edmilsonclss/", "Visite o LinkedIn do desenvolvedor deste App!")
                .addItem(vers??o)
                .create();
    }
}