package pokemon;

import javax.swing.JOptionPane;

/**
 *
 * @author jeani
 */
public class Batalha {

    private int meuPokemonHP;
    private int outroPokemonHP;
    private String meuPokemonNome;
    private String outroPokemonNome;

    public void meuPokemon(String nome, int vida) {
        this.meuPokemonNome = nome;
        this.meuPokemonHP = vida;

    }

    public void outroPokemon(String nome, int vida) {
        this.outroPokemonNome = nome;
        this.outroPokemonHP = vida;

    }

    public void startBattle() {

        JOptionPane.showMessageDialog(null, "A batalha irá começar!");
        
        if (this.meuPokemonHP > this.outroPokemonHP) {
            JOptionPane.showMessageDialog(null, "O seu Pokemon " + this.meuPokemonNome + " venceu a batalha!");
        }
        
        else if (this.meuPokemonHP == this.outroPokemonHP) {
            JOptionPane.showMessageDialog(null, "Empate");
        } 
        
        else {
            JOptionPane.showMessageDialog(null,
                    "O Pokemon " + this.outroPokemonNome + " do adversário venceu a batalha!");
        }

    }
}
