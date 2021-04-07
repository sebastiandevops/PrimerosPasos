public class uso_arraysii {
    public static void main(String[] args) {
        /*String paises[] = new String[8];
        paises[0] = "España";
        paises[1] = "México";
        paises[2] = "Perú";
        paises[3] = "Argentina";
        paises[4] = "Colombia";
        paises[5] = "Ecuador";
        paises[6] = "Panamá";
        paises[7] = "Bolivia";
        String[] paises = {"España, México, Perú, Argentina, Colombia, Ecuador, Panamá, Bolivia"};*/
        /*String[] paises = new String[8];
        for (int i = 0; i < 8; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce país " + (i + 1));
        }

        for (String elemento : paises) {
            System.out.println(elemento);*/
        int[] matriz_aleatorios = new int[150];
        for (int i = 0; i < matriz_aleatorios.length; i++) {
            matriz_aleatorios[i] = (int) Math.round(Math.random() * 100);
        }
        for (int numeros : matriz_aleatorios) {
            System.out.print(numeros + ", ");
        }
    }
}
