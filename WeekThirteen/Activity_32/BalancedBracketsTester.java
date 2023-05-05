package WeekThirteen.Activity_32;

public class BalancedBracketsTester
{
    public static void main(String[] args)
    {
        BalancedBrackets balanced = new BalancedBrackets();

        System.out.println(balanced.checkBalance("()"));
        System.out.println(balanced.checkBalance("(()())"));
        System.out.println(balanced.checkBalance("((((()(())))))"));
        System.out.println(balanced.checkBalance("(()"));

        System.out.println(balanced.checkBalance("[]"));
        System.out.println(balanced.checkBalance("[[][]]"));
        System.out.println(balanced.checkBalance("[[[[[][[]]]]]]"));
        System.out.println(balanced.checkBalance("[[]"));

        System.out.println(balanced.checkBalance("{}"));
        System.out.println(balanced.checkBalance("{{}{}}"));
        System.out.println(balanced.checkBalance("{{{{{}{{}}}}}}"));
        System.out.println(balanced.checkBalance("{{}"));

        System.out.println(balanced.checkBalance("(([{}]))"));
        System.out.println(balanced.checkBalance("{[()}"));
    }
}
