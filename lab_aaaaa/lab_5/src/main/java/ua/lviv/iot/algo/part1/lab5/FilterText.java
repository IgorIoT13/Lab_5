package ua.lviv.iot.algo.part1.lab5;

import java.util.*;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class FilterText {
    private WriterText writerText =new WriterText();
    private List<List<String>> listToCollect = new ArrayList<List<String>>();

    private String[] words ;
    private String resultStrToOutInfo = "";

    public void Filter(int maxCountWords){
        writerText.WriterFile("D:\\UniverPackage\\Programing\\Java\\Laba\\mavenP\\lab_5\\work\\filename.txt");
        words = writerText.getText().split("\\s");

        for(int i=0; i<words.length;i++){
            String currentWords= words[i];
           listToCollect.add(Arrays.stream(words)
                                    .filter(word -> word.equalsIgnoreCase(currentWords))
                                    .collect(Collectors.toList())) ;
        }


        listToCollect = listToCollect.stream()
                                      .filter(list -> list.size() > maxCountWords)
                                      .collect(Collectors.toList());


        Set<List<String>> filteredList = new HashSet<List<String>>(listToCollect);
        List<List<String>> resultList =new ArrayList<>(filteredList);
        listToCollect=resultList;
        }

        public String outInfoMethod(){
            for (List<String> list: listToCollect) {
                resultStrToOutInfo += "(" + " ' " + list.get(0) +" ' вжита кількість раз : " + list.size() + " ) " ;
            }
        return resultStrToOutInfo;
        }
    }






