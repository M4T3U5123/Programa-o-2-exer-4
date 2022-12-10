public class pessoa {
    String name;
    int energia;
    int hp;

    pessoa(){

    }

    pessoa(String nome, int energia, int hp){
        this.name = nome;
        this.energia = energia;
        this.hp = hp;
    }

    void gastar(int vidaPerdida){
        this.hp -= vidaPerdida;
    }

    void cansaso(int energiaPerdida){
        this.energia -= energiaPerdida;
    }
}
