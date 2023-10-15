package pizza.khabbachi.ma.pizzarecipies.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


import pizza.khabbachi.ma.pizzarecipies.R;
import pizza.khabbachi.ma.pizzarecipies.classes.Produit;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;

    public PizzaAdapter(List<Produit> produits, Activity activity) { // Corrigé : Utilisez "produits" au lieu de "fruits"
        this.produits = produits;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return produits.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.item, null);
        TextView nom = convertView.findViewById(R.id.nom);
        ImageView photo = convertView.findViewById(R.id.photo);
        TextView nbrIngredients = convertView.findViewById(R.id.nbrIngredients);
        TextView duree = convertView.findViewById(R.id.duree);

        TextView idTextView = convertView.findViewById(R.id.id);








        Produit produit = produits.get(position);

        nom.setText(produit.getNom());
        photo.setImageResource(produit.getPhoto());
        nbrIngredients.setText(String.valueOf(produit.getNbrIngredients()));
        duree.setText(String.valueOf(produit.getDuree()));
        idTextView.setText(String.valueOf(produit.getId()));


        return convertView;
    }
}
