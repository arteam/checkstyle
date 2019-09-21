//non-compiled with javac: Compilable with Java13
package com.puppycrawl.tools.checkstyle.javaparser;

public class InputJavaParserTextBlockTest {

    public static void main(String[] args) {

        String hello = """
    Hello, multiline text blocks!""";

// almost the same but different semantics
// (yes, there's a newline at the end)
        hello = """
    Hello, multiline text blocks!
    """;

// newline at the start
        hello = """

    Hello, multiline text blocks!
    """;

        System.out.println("""
    Hello, multiline text blocks!""");

        System.out.println("""
    Hello, multiline text blocks!
    """);

        System.out.println("""
    Hello, multiline text blocks!
""");

        String phrase = """
    {
        greeting: "hello",
        audience: "text blocks",
        punctuation: "!"
    }
    """;

        System.out.println(phrase);

        String literalPhrase = ""
                + " {\n"
                + "     greeting: \"hello\",\n"
                + "     audience: \"text blocks\",\n"
                + "     punctuation: \"!\"\n"
                + " }\n";
        System.out.println(literalPhrase);

        String empty = """
""";

        String story = """
    "When I use a word," Humpty Dumpty said,
    in rather a scornful tone, "it means just what I
    choose it to mean - neither more nor less."
    "The question is," said Alice, "whether you
    can make words mean so many different things."
    "The question is," said Humpty Dumpty,
    "which is to be master - that's all."
    """;

        String code = "public void print(Object o) {" +
                """
                  System.out.println(Objects.toString(o));
              }
              """;

        String escaped = """
              \"""Hi!"
              """;
    }
}
