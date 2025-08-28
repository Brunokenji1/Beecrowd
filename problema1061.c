#include <stdio.h>
 
int main() {
    char d[4];
    char doispontos1;
    int hora, min, seg, dia, dia01, dia02, resto, segundos, segundosd1, segundosd2;
    
    scanf(" %s %d", d, &dia01);
    scanf("%d %c %d %c %d", &hora,&doispontos1, &min, &doispontos1, &seg );
    segundosd1 = ((((((dia01*24)+hora)*60)+min)*60)+seg);
    
    scanf(" %s %d", d, &dia02);
    scanf("%d %c %d %c %d", &hora,&doispontos1, &min, &doispontos1, &seg );
    segundosd2 = ((((((dia02*24)+hora)*60)+min)*60)+seg);
    
    segundos = segundosd2-segundosd1;
    printf("%d\n", segundos);
    dia = segundos/86400;
    hora = (segundos%86400)/3600;
    min = (segundos%86400%3600)/60;
    seg = (segundos%86400%3600%60)/60;
    
    printf("%d dia(s)\n", dia);
    printf("%d hora(s)\n", hora);
    printf("%d minuto(s)\n", min);
    printf("%d segundo(s)\n", seg);
    
    
    return 0;
}
