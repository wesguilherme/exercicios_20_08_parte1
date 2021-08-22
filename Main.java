/* exercicio 1
package com.company;

public class Main {

    public static void main(String[] args) {
        String apelido = "Gomez";
        int idade = 35;
        boolean id = false;
        double saldo = 45857.90;
        String nome = "Julián";
    }
}*/

/* exercicio 2
package com.company;

public class Main {

    public static void main(String[] args) {
        String nome;
        int idade;
        double Saldo;
        String Apellido;
        String direcao;
        boolean carteira_de_motorista;
        double altura_da_pessoa;
        int quantidade_de_filhos;
    }
}
*/

/* exercicio 3
package com.company;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyPad  = new Scanner(System.in);
        int costperday; //inicializa variavel custo
        costperday = 2; // insere valor
        int daysOfCampaign;//inicializa variavel calculo
        int numberOfDays;
        System.out.println("Informe quantos dias durou a campanha: ");
        numberOfDays = keyPad.nextInt();
        daysOfCampaign = costperday*numberOfDays;//faz calculo
        System.out.println(numberOfDays+" dias de campanha custaram "+daysOfCampaign);//printa resultado
    }
}
*/



// exercicio 4
package com.company;

        import java.math.RoundingMode;
        import java.text.DecimalFormat;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyPad  = new Scanner(System.in);

        double prize;//inicializa valor do premio
        System.out.println("Informe o valor do seu prêmio: ");
        prize = keyPad.nextDouble();
        float tax1;//inicializa imposto1
        tax1 = 2.45f;
        System.out.println(tax1);//printa imposto1
        int tax2;//inicializa imposto2
        tax2 = 15;
        System.out.println(tax2);//printa imposto2
        int tax3;//inicializa imposto3
        tax3 = 3;
        System.out.println(tax3);//printa imposto3

        float sumTaxes;//inicializa soma impostos
        sumTaxes = tax1+tax2+tax3;//soma impostos
        System.out.println(sumTaxes);//printa sumTaxes
        float multiplier;//inicializa multiplier
        multiplier = 1 - (sumTaxes/100);//subtrai 1 menos sumTaxes
        System.out.println(multiplier);//printa multiplier
        double liquidprize;//inicializa liquidprize
        liquidprize = multiplier*prize;//multiplica valor do premio pelo fator multiplicador
        System.out.println("O valor após os descontos é de: R$ "+liquidprize);//printa liquidprize
    }
}
