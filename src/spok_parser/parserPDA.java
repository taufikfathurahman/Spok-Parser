/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spok_parser;

/**
 *
 * @author babyanaconda
 */
public class parserPDA {
    token tkn = new token();
    static final int MAX = 100;
    int top;
    char a[] = new char[MAX];
    
    boolean isEmpty(){
        return (top < 0);
    }
    
    parserPDA(){
        top = -1;
    }
    
    void push(char x){
        if(top >= (MAX-1)){
            System.out.println("Stack Overflow");
        }else{
            a[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }
    
    void pop(){ 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
        } 
        else{ 
            char x = a[top--];
        } 
    }
    
    char [] parser(String Subjek, String Predikat, String Objek, String Keterangan){
        top = -1;
        push('#');
        push('S');
        char spok[] = new char[MAX];
        int i = 0;
        boolean kondisi = true;
        while(!isEmpty() && kondisi == true){
            System.out.print("top = " + a[top]);
            switch(a[top]){
                case 'S':
                    if(tkn.isSubjek(Subjek) && tkn.isPredikat(Predikat)){
                        pop();
                        push('P');
                        push('s');
                        spok[i] = 'S';
                        i++;
                        spok[i] = 'P';
                        i++;
                    }else{
                        kondisi = false;
                    }break;
                case 'P':
                    if(tkn.isObjek(Objek)){
                        pop();
                        push('O');
                        push('p');
                        spok[i] = 'O';
                        i++;
                    }else if(tkn.isKeterangan(Keterangan)){
                        pop();  
                        push('K');
                        push('p');                        
                        spok[i] = 'K';
                        i++;
                    }else{
                        kondisi = false;
                    }break;
                case 'O':
                    if(tkn.isKeterangan(Keterangan)){
                        spok[i] = 'K';
                        pop();
                        push('K'); 
                        push('o');
                        i++;
                    }else{
                        kondisi = false;
                    }break;
                case 'K':
                    pop();break;
                case 'o':
                    pop();break;
                case 'p':
                    pop();break;
                case 's':
                    pop();break;
                case '#':
                    pop();break;
                default:
                    kondisi = false;
            }            
        }
        return spok;
    }
}
