package me.whiteship.refactoring._13_loop._33_replace_loop_with_pipeline;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// 반복문을 파이프라인으로 바꾸기
// 고전적인 반복문을 파이프라인 오퍼레이션을 사용해 표현하면 코드를 더 명확하게 만들 수 있다.
// filter : 전달받은 조건의 true에 해당하는 데이터만 전달
// map : 전달받은 함수를 사용해 원하는 출력값으로 변환
public class Author {

    private String company;

    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static public List<String> TwitterHandles(List<Author> authors, String company) {

        return authors.stream()
                .filter(author -> author.company.equals(company))
                .map(author -> author.twitterHandle)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

//        var result = new ArrayList<String> ();
//        for (Author a : authors) {
//            if (a.company.equals(company)) {
//                var handle = a.twitterHandle;
//                if (handle != null)
//                    result.add(handle);
//            }
//        }
//        return result;
    }

}
