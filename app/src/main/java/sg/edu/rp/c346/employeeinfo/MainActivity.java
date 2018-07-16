package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeInfo> alEmployeeInfo;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);

        alEmployeeInfo = new ArrayList<>();
        EmployeeInfo employee1 = new EmployeeInfo("John", "Software Technical Leader", "3400.0");
        EmployeeInfo employee2 = new EmployeeInfo("May", "Programmer", "2200.0");
        alEmployeeInfo.add(employee1);
        alEmployeeInfo.add(employee2);

        caEmployee = new CustomAdapter(this, R.layout.employee_info, alEmployeeInfo);

        lvEmployee.setAdapter(caEmployee);
    }
}
