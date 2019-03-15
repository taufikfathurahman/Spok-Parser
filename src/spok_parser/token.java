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
public class token {
    
    boolean isSubjek(String subjek){
        boolean cek = false;
        int state = 0;
        int i = 0;
        char tmpStr[] = subjek.toCharArray();
        while(i < tmpStr.length && state != 999){
            System.out.print(tmpStr[i]);
            switch(state){
                case 0:
                    if(tmpStr[i] == 'S'){
                        state++;
                    }else if(tmpStr[i] == 'A'){
                        state++;
                    }else if(tmpStr[i] == 'K'){
                        state++;
                    }else if(tmpStr[i] == 'M'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 1:
                    if(tmpStr[i] == 'a'){
                        state++;
                    }else if(tmpStr[i] == 'k'){
                        state++;
                    }else if(tmpStr[i] == 'i'){
                        state++;
                    }else if(tmpStr[i] == 'e'){
                        state++;
                    }else if(tmpStr[i] == 'r'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 2:
                    if(tmpStr[i] == 'y'){
                        state++;
                    }else if(tmpStr[i] == 'u'){
                        state = 100;
                    }else if(tmpStr[i] == 't'){
                        state++;
                    }else if(tmpStr[i] == 'l'){
                        state++;
                    }else if(tmpStr[i] == 'r'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 3:
                    if(tmpStr[i] == 'a'){
                        state = 100;
                    }else if(tmpStr[i] == 'i'){
                        state++;
                    }else if(tmpStr[i] == 'e'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 4:
                    if(tmpStr[i] == 'a'){
                        state++;
                    }else if(tmpStr[i] == 'k'){
                        state--;
                    }else{
                        state = 999;
                    }break;
                case 5:
                    if(tmpStr[i] == 'n'){
                        state = 100;
                    }else{
                        state = 999;
                    }break;
                default:
                    state = 999;
                    break;
            }
            i++;
        }
        if(state == 100){
            cek = true;
        }
        return cek;
    }
    
    boolean isPredikat(String subjek){
        boolean cek = false;
        int state = 0;
        int i = 0;
        char tmpStr[] = subjek.toCharArray();
        while(i < tmpStr.length && state != 999){
            System.out.print(tmpStr[i]);
            switch(state){
                case 0:
                    if(tmpStr[i] == 'm'){
                        state++;
                    }else if(tmpStr[i] == 'b'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 1:
                    if(tmpStr[i] == 'e'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 2:
                    if(tmpStr[i] == 'n'){
                        state++;
                    }else if(tmpStr[i] == 'm'){
                        state++;
                        break;
                    }else if(tmpStr[i] == 'r'){
                        state++;
                    }else if(tmpStr[i] == 'l'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 3:
                    if(tmpStr[i] == 'g'){
                        state++;
                        break;
                    }else if(tmpStr[i] == 'b'){
                        state++;
                    }else if(tmpStr[i] == 'm'){
                        state++;
                    }else if(tmpStr[i] == 'j'){
                        state++;
                    }else if(tmpStr[i] == 'a'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 4:
                    if(tmpStr[i] == 'e'){
                        state++;
                        break;
                    }else if(tmpStr[i] == 'u'){
                        state++;
                    }else if(tmpStr[i] == 'a'){
                        state++;
                    }else if(tmpStr[i] == 'j'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 5:
                    if(tmpStr[i] == 'r'){
                        state++;
                    }else if(tmpStr[i] == 'a'){
                        state++;
                    }else if(tmpStr[i] == 'i'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 6:
                    if(tmpStr[i] == 'j'){
                        state++;
                        break;
                    }else if(tmpStr[i] == 't'){
                        state = 100;
                    }else if(tmpStr[i] == 'n'){
                        state = 100;
                    }else if(tmpStr[i] == 'l'){
                        state = 100;
                    }else if(tmpStr[i] == 'r'){
                        state = 100;
                    }else{
                        state = 999;
                    }break;
                case 7:
                    if(tmpStr[i] == 'a'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 8:
                    if(tmpStr[i] == 'k'){
                        state = 5;
                    }else{
                        state = 999;
                    }break;
                default:
                    state = 999;
                    break;
            }
            i++;
        }
        if(state == 100){
            cek = true;
        }
        return cek;
    }
    
    boolean isObjek(String subjek){
        boolean cek = false;
        int state = 0;
        int i = 0;
        char tmpStr[] = subjek.toCharArray();
        while(i < tmpStr.length && state != 999){
            System.out.print(tmpStr[i]);
            switch(state){
                case 0:
                    if(tmpStr[i] == 't'){
                        state++;
                    }else if(tmpStr[i] == 'm'){
                        state++;
                    }else if(tmpStr[i] == 'g'){
                        state++;
                    }else if(tmpStr[i] == 'a'){
                        state++;
                    }else if(tmpStr[i] == 'c'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 1:
                    if(tmpStr[i] == 'u'){
                        state++;
                    }else if(tmpStr[i] == 'a'){
                        state++;
                    }else if(tmpStr[i] == 'p'){
                        state++;
                    }else if(tmpStr[i] == 'o'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 2:
                    if(tmpStr[i] == 'g'){
                        state++;
                    }else if(tmpStr[i] == 'k'){
                        state++;
                    }else if(tmpStr[i] == 'l'){
                        state++;
                    }else if(tmpStr[i] == 'm'){
                        state++;
                    }else if(tmpStr[i] == 'n'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 3:
                    if(tmpStr[i] == 'a'){
                        state++;
                    }else if(tmpStr[i] == 'e'){
                        state = 100;
                    }else if(tmpStr[i] == 'i'){
                        state++;
                    }else if(tmpStr[i] == 'f'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 4:
                    if(tmpStr[i] == 's'){
                        state = 100;
                    }else if(tmpStr[i] == 'n'){
                        state++;
                    }else if(tmpStr[i] == 'k'){
                        state++;
                    }else if(tmpStr[i] == 'i'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 5:
                    if(tmpStr[i] == 'a'){
                        state++;
                    }else if(tmpStr[i] == 'g'){
                        state = 100;
                    }else{
                        state = 999;
                    }break;
                case 6:
                    if(tmpStr[i] == 'n'){
                        state = 100;
                    }else if(tmpStr[i] == 's'){
                        i++;
                        if(tmpStr[i] == 'i'){
                            state = 100;
                        }
                    }else{
                        state = 999;
                    }break;
                default:
                    state = 999;
                    break;
            }
            i++;
        }
        if(state == 100){
            cek = true;
        }
        return cek;
    }
    
    boolean isKeterangan(String subjek){
        boolean cek = false;
        int state = 0;
        int i = 0;
        char tmpStr[] = subjek.toCharArray();
        while(i < tmpStr.length && state != 999){
            System.out.print(tmpStr[i]);
            switch(state){
                case 0:
                    if(tmpStr[i] == 'd'){
                        if(tmpStr[1] == 'i'){
                            if(tmpStr[2] == ' '){
                                i = 2;
                                state++;
                            }
                        }
                    }else if(tmpStr[i] == 'k'){                        
                        if(tmpStr[1] == 'e'){
                            if(tmpStr[2] == ' '){
                                i = 2;
                                state++;
                            }
                        }
                    }else{
                        state = 999;
                    }break;
                case 1:
                    if(tmpStr[i] == 'k'){
                        state++;
                    }else if(tmpStr[i] == 'd'){
                        state++;
                    }else if(tmpStr[i] == 'p'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 2:
                    if(tmpStr[i] == 'a'){
                        state++;
                    }else if(tmpStr[i] == 'o'){
                        state++;
                    }else if(tmpStr[i] == 'e'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 3:
                    if(tmpStr[i] == 'm'){
                        state++;
                    }else if(tmpStr[i] == 'p'){
                        state++;
                    }else if(tmpStr[i] == 's'){
                        state++;
                    }else if(tmpStr[i] == 'r'){
                        state++;
                    }else if(tmpStr[i] == 'l'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 4:
                    if(tmpStr[i] == 'p'){
                        state++;
                    }else if(tmpStr[i] == 'u'){
                        state++;
                    }else if(tmpStr[i] == 'a'){
                        i++;
                        if(tmpStr[i] == 's'){                            
                            state = 100;
                        }else if(tmpStr[i] == 'n'){
                            state = 100;
                        }else{
                            state++;
                        }
                    }else{
                        state = 999;
                    }break;
                case 5:
                    if(tmpStr[i] == 'u'){
                        state++;
                    }else if(tmpStr[i] == 'r'){
                        state = 100;
                    }else if(tmpStr[i] == 's'){
                        state++;
                    }else{
                        state = 999;
                    }break;
                case 6:
                    if(tmpStr[i] == 's'){
                        state = 100;
                    }else if(tmpStr[i] == 'a'){
                        i++;
                        if(tmpStr[i] == 'h'){
                            i++;
                            if(tmpStr[i] == 'a'){
                                i++;
                                if(tmpStr[i] == 'a'){
                                    i++;
                                    if(tmpStr[i] == 'n'){
                                        state = 100;
                                    }
                                }
                            }
                        }
                    }else{
                        state = 999;
                    }break;
                default:
                    state = 999;
                    break;
            }
            i++;
        }
        if(state == 100){
            cek = true;
        }
        return cek;
    }
}
