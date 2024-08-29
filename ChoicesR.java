package to.msn.wings.ifbun2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.youareplayer.R;

public class ChoicesR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_choices_r);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btn4 = findViewById(R.id.imageButton4);
        Button btn5 = findViewById(R.id.imageButton5);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.imageButton4:
                        Intent intent1 = new Intent(ChoicesR.this, ExecutionText.class);
                        startActivity(intent1);
                        break;
                    case R.id.imageButton5:
                        Intent intent2 = new Intent(ChoicesR.this, ChoicesR.class);
                        startActivity(intent2);
                        break;
                }
            }
        };

        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
    }
}
