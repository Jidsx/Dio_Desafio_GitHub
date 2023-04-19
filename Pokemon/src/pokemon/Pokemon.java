package pokemon;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jeani
 */
public class Pokemon {

    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.level = new Random().nextInt(101);
        this.calcularBonus();
        this.calcularAtributos();

    }

    public void calcularAtributos() {
        
        if (getTipo().equals("Fogo")) {
            setVida(1000 - 80);
            setAtaque(75);
            setDefesa(10);
        } else if (getTipo().equals("Agua")) {
            setVida(1000 - 50);
            setAtaque(65);
            setDefesa(50);
        } else if (getTipo().equals("Planta")) {
            setVida(1000 + 40);
            setAtaque(25);
            setDefesa(30);
        } else if (getTipo().equals("Pedra")) {
            setVida(1000 + 10);
            setAtaque(45);
            setDefesa(80);
        }

    }

    public void calcularBonus() {
        this.vida += this.level / 4;
        this.ataque += this.level / 2;
        this.defesa += this.level / 3;
        this.vida += (this.level * 10) - 10;


    }

    public void imprimePokemon() {
        
        calcularBonus();

            if(getTipo().equals("Fogo")){
        
    String mensagem = "Dados do Pokémon:\n";
    mensagem += "Nome: " + nome + "\n";
    mensagem += "Tipo: " + tipo + "\n";
    mensagem += "Level: " + level + "\n";
    mensagem += "Vida: " + vida + "\n";
    mensagem += "Ataque: " + ataque + "\n";
    mensagem += "Defesa: " + defesa;
    JOptionPane.showMessageDialog(null, mensagem, "Pokémon", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("Charmander.png")));
        }
        
    if(getTipo().equals("Agua")){
        
    String mensagem = "Dados do Pokémon:\n";
    mensagem += "Nome: " + nome + "\n";
    mensagem += "Tipo: " + tipo + "\n";
    mensagem += "Level: " + level + "\n";
    mensagem += "Vida: " + vida + "\n";
    mensagem += "Ataque: " + ataque + "\n";
    mensagem += "Defesa: " + defesa;
    JOptionPane.showMessageDialog(null, mensagem, "Pokémon", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("Squirtle.png")));
        }
        
    if(getTipo().equals("Planta")){
        
    String mensagem = "Dados do Pokémon:\n";
    mensagem += "Nome: " + nome + "\n";
    mensagem += "Tipo: " + tipo + "\n";
    mensagem += "Level: " + level + "\n";
    mensagem += "Vida: " + vida + "\n";
    mensagem += "Ataque: " + ataque + "\n";
    mensagem += "Defesa: " + defesa;
    JOptionPane.showMessageDialog(null, mensagem, "Pokémon", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("Bulbasauro.png")));
        }
    
    if(getTipo().equals("Pedra")){
        
    String mensagem = "Dados do Pokémon:\n";
    mensagem += "Nome: " + nome + "\n";
    mensagem += "Tipo: " + tipo + "\n";
    mensagem += "Level: " + level + "\n";
    mensagem += "Vida: " + vida + "\n";
    mensagem += "Ataque: " + ataque + "\n";
    mensagem += "Defesa: " + defesa;
    JOptionPane.showMessageDialog(null, mensagem, "Pokémon", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("Geodude.png")));
        }

    }

}
