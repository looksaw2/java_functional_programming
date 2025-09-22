package org.example;

import java.util.regex.Pattern;

public class EmailValidation {
    private static Pattern emailPattern =
            Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\n");
    private static Function<String,Result<String>> emailChecker = s -> {
      if(s == null){
          return Result.failure("Email is empty(null)");
      }else if(s.isEmpty()){
          return Result.failure("Email is empty(empty)");
      }else if(emailPattern.matcher(s).matches()){
          return Result.success(s);
      }else{
          return Result.failure("Invalid email address");
      }
    };
    private static Effect<String> success = s -> System.out.println("Email validated successfully");
    private static Effect<String> failure = s -> System.out.println("Email validation failed");

    public static void main(String[] args) {
        emailChecker.apply("this.is@my.email").bind(success,failure);
        emailChecker.apply("2814031084@qq.com").bind(success,failure);
    }
}
