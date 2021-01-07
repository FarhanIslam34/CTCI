/*
 * reverse string
 */

#include <string.h>
#include <stdio.h>

int main(int argc, char *argv[]){
    char tmp;
    //This implementation does not modify the input
    if (argc != 2){
        return 0;
    }
    char *string = argv[1];
    int string_length = strlen(string);
    char reversed_string[string_length]; 

    for (int i = 0; i <= string_length-1; i++){
        reversed_string[i] = *(string+((string_length-1)-i));
    }
    reversed_string[string_length] = '\0';
    printf(reversed_string);

    // This one does
    /*
    if (argc != 2){
       return 0;
    } 

    char *start = argv[1];
    char *end = start;
    while (*end){
        end++;
    }
    *end = '\0';
    end--;
    while (start < end){
        tmp = *start;
        *start = *end;
        *end = tmp;
        end--;
        start++;
    }
    printf(argv[1]);
    */
}
