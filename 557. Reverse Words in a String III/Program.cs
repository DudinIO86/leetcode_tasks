
using System;
// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
// Example 1:
// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
// Example 2:
// Input: s = "God Ding"
// Output: "doG gniD"

//Исходный текст
String s = "Let's take LeetCode contes";


//Функция преобразования текста в массив

//Функция подсчета слов
int ConterWord(string text)
{
    int count =0;

    for(int i=0;i<text.Length;i++)
    {
        if(text[i]==' ')
        {
            count++;
        }
    }
return count+1;
}

//Функция заполнения массива словами
string[] WordArray(string s)
{
    string[] text_ar=new string[ConterWord(s)];

    string temp="";
    int index=0;

    for(int i=0;i<s.Length;i++)
    {
        if(s[i]==' ')
        {
            text_ar[index]=temp;
            index++;
            temp="";
        }
        else if(i==s.Length-1)
        {
            temp=temp+s[i];
            text_ar[index]=temp;
        }
        else
        {
            temp=temp+s[i];
        }
    }
return text_ar;
}

// //Функция переворачивания элементов массива
String ConveryElemArray(string[] array)
{
    for(int i=0;i<array.Length;i++)
    {
        array[i]=Convert(array[i]);
    }
string text=string.Join(" ",array);
return text;
}

String Convert(String word)
{
    char[] chars = word.ToCharArray();
    char temp;

    for(int i=0;i<word.Length/2;i++)
    {
        
        temp=chars[word.Length-i-1];
        chars[word.Length-i-1]=chars[i];
        chars[i]=temp;
    }
    word=new string(chars);
    
return word;
}

//Блок вывода результатов
System.Console.WriteLine(s);
System.Console.WriteLine(ConveryElemArray(WordArray(s)));

