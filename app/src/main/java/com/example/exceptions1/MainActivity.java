package com.example.exceptions1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.result_text_view);

        try {
            // קריאה לפונקציה הראשונה
            function1();
        } catch (ArithmeticException e) {
            // טיפול בחריגה
            resultTextView.setText("Caught ArithmeticException: " + e.getMessage());
        }
    }

    // פונקציה ראשונה
    private void function1() {
        // קריאה לפונקציה השנייה
        function2();
    }

    // פונקציה שנייה
    private void function2() {
        // קריאה לפונקציה השלישית
        function3();
    }

    // פונקציה שלישית - יוצרת חריגה
    private void function3() {
        // יצירת חריגה
        int result = 10 / 0; // זריקת חריגה מסוג ArithmeticException
    }
}
