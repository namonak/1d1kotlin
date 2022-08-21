package boj.problems.step12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No14425Test {
    File path = new File(".");
    String input = path.getAbsolutePath() + "/src/test/java/boj/problems/step12/No14425_input.txt";
    String output = path.getAbsolutePath() + "/src/test/java/boj/problems/step12/No14425_output.txt";

    @Test
    @DisplayName("문자열 집합 테스트")
    void 문자열_집합_테스트() throws IOException {
        System.out.println("문자열 집합 : https://www.acmicpc.net/problem/14425");

        BufferedReader br_given = new BufferedReader(new FileReader(input));
        BufferedReader br_want = new BufferedReader(new FileReader(output));
        StringWriter sw = new StringWriter();
        BufferedWriter bw_got = new BufferedWriter(sw);

        No14425.solve(br_given, bw_got);

        bw_got.close();

        BufferedReader br_got = new BufferedReader(new StringReader(sw.getBuffer().toString()));

        String got = br_got.lines().collect(Collectors.joining());
        String want = br_want.lines().collect(Collectors.joining());

        assertEquals(want, got);
    }
}
