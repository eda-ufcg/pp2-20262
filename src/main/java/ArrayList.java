public class ArrayList {

    private int[] lista;
    public static final int CAPACIDADE_DEFAULT = 20;
    private int tamanho;
    
    public ArrayList() {
        this(CAPACIDADE_DEFAULT);
    }
    
    public ArrayList(int capacidade) {
        this.lista = new int[capacidade];
        this.tamanho = 0;
    }
    
    public boolean isEmpty() {
        return this.tamanho == 0;
    }
    
    public int size() {
        return this.tamanho;
    }
    
    public boolean add(int v) {
        this.lista[tamanho++] = v;
        return true;
    }
    
    public int indexOf(int v) {
        for (int i = 0; i < tamanho; i++)
            if (this.lista[i] == v)
                return i;
        return -1;
    }
    
    // remove o valor no índice passado como parâmetro. retorna o valor removido.
    // lançar exceção IndexOutOfBoundsException se o índice não for válido. 
   public int remove(int index) {
        return -1;
    }
   
    
 
}
