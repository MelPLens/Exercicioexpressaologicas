import java.util.Scanner;
class exerciciologicos
{
    public static void main(String [] args);
}

System.out.print(" Ola ! Escolha umas as opcoes abaixo caso voce esteja dentro dessas condicoes./n Digite 1 se voce for idoso /n Digite 2 se voce for possui alguma deficiencia /n Digite 3 se voce for uma gestante /n Digite 4 caso voce nao esteja dentro em nenhuma condicoes dessas. ");
Scanner ler = new Scanner (System.in);
int numero1;

if(numero1=1)
{
   System.out.print("Voce pode estacionar na vaga especial!");
   numero1=ler.nextInt;
}
else if (numero1=2)
{
   System.out.print ("Voce pode estacionar na vaga especial!");
   numero1=ler.nextInt;
}
else if (numero1=3)
{
    System.out.print ("Voce pode estacionar na vaga especial!");
    numero1=ler.nextInt;
}
else if (numero1=4)
{
    System.out.print ("Voce nao pode estacionar na vaga especial!");
    numero1=ler.nextInt;
}
else
{
    System.out.print ("Digite uma das opcoes 1,2,3 e 4 !");
    numero1=ler.nextInt;
}
}