package com.example.projectdt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity  {

    RatingBar r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22;
    TextView txtViewAttire,generalRatingValue;
    Spinner Select_Spo,Select_NumberOf_Calls;
    Button Send_Form;
    double Total_Rating ;
    String selectSpo,selectNumberOfCalls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final TimePickerDialog[] _timePickerDialog = new TimePickerDialog[1];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUi();
        setUpListener();
        StartCalculator(Total_Rating);

        ImageView icon;
        icon = findViewById(R.id.icon_home);



    }

    public void StartCalculator(double star){
        double adding = star/5;
        Total_Rating = adding;
        generalRatingValue.setText(String.valueOf( Total_Rating));

    }

    public void setUpUi(){
        r1 = findViewById(R.id.R1);
        r2 = findViewById(R.id.R2);
        r3 = findViewById(R.id.R3);
        r4 = findViewById(R.id.R4);
        r5 = findViewById(R.id.R5);
        r6 = findViewById(R.id.R6);
        r7 = findViewById(R.id.R7);
        r8 = findViewById(R.id.R8);
        r9 = findViewById(R.id.R9);
        r10 = findViewById(R.id.R10);
        r11 = findViewById(R.id.R11);
        r12 = findViewById(R.id.R12);
        r13 = findViewById(R.id.R13);
        r14 = findViewById(R.id.R14);
        r15 = findViewById(R.id.R15);
        r16 = findViewById(R.id.R16);
        r17 = findViewById(R.id.R17);
        r18 = findViewById(R.id.R18);
        r19 = findViewById(R.id.R19);
        r20 = findViewById(R.id.R20);
        r21 = findViewById(R.id.R21);
        r22 = findViewById(R.id.R22);

        txtViewAttire = findViewById(R.id.txt_View_Attire);
        generalRatingValue = findViewById(R.id.general_rating_value);
        Send_Form = findViewById(R.id.Send_Form);
        Select_Spo = findViewById(R.id.Select_Spo);
        Select_NumberOf_Calls = findViewById(R.id.Select_NumberOf_Calls);


    }
    public Retrofit APIClient(){
          final String BASE_URL = " ";
        Retrofit retrofit = null;

        public static Retrofit getClient() {
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }


    public void setUpListener (){
        Select_Spo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i>0){
                    selectSpo=Select_Spo.getSelectedItem().toString();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Select_NumberOf_Calls.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i>0){
                    selectNumberOfCalls= Select_NumberOf_Calls.getSelectedItem().toString();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        r1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar,float rating, boolean fromUser) {
                generalRatingValue.setText(String.format("%2.1f", rating));

                Toast.makeText(getApplicationContext(), rating + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                generalRatingValue.setText(String.format("%2.1f", v));
                Toast.makeText(getApplicationContext(), v + "\n", Toast.LENGTH_LONG).show();
            }
        });

        r3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                System.out.println(v/5);
                generalRatingValue.setText(String.valueOf( v /5));
                StartCalculator(v);
                Toast.makeText(getApplicationContext(), v / 5 +  "\n", Toast.LENGTH_LONG).show();
            }
        });
        r4.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                generalRatingValue.setText(String.format("%2.1f", v));

                Toast.makeText(getApplicationContext(), v + "\n", Toast.LENGTH_LONG).show();
            }
        });

        r5.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r6.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r7.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r8.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r8.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r9.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r10.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r11.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r12.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r13.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r14.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });

        r15.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r16.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r17.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r18.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r19.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r20.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r21.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(), v + "\n"+"", Toast.LENGTH_LONG).show();
            }
        });
        r22.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                generalRatingValue.setText(String.format("%2.1f", v));

                Toast.makeText(getApplicationContext(), v + "\n", Toast.LENGTH_LONG).show();
            }
        });


        Send_Form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();

            }
        });
    }

    private void sendData() {
        try {
            JSONArray attArray = new JSONArray();
            final JSONObject obj = new JSONObject();
            obj.put("ManagerExternalId", "8291");
            obj.put("EmployeeExternalId",selectSpo);
            obj.put("Latitude", 22.33333);
            obj.put("Longitude", 33.333);
            obj.put("Shift", "Morning");
            obj.put( "NoOfCalls", selectNumberOfCalls);
            obj.put("WorkingType", "Planned");
            obj.put("StartTime", "12:00:00");
            obj.put("EndTime", "12:00:00");
            obj.put("MrBestDayRating", 2.5);
            obj.put("Status", "Poor");
            obj.put("DeliveryDayRating", 6);
            obj.put("DeliverySuggestedActions", "Good");
            obj.put("GeneralAttributeDayRating", 5);
            obj.put("GenAttrSuggestedActions", "Good");
            obj.put( "GenAttrAttireRating", 4);
            obj.put("GenAttrBagConditionAndOrganizationRating", 2);
            obj.put("GenAttrCustomerRelationsRating", 5);
            obj.put("GenAttrTimeManagementRating", 5);
            obj.put("GenAttrPromotionalMaterialHandlingRating", 4);
            obj.put("KnowledgeDayRating", 3);
            obj.put("KnowledgeSuggestedActions", "Good");
            obj.put("KnowledgeCompetitionRating", 3);
            obj.put("KnowledgeProductKnowledgeExecutionRating", 5);
            obj.put("KnowledgeDetailingAidClinicalStudieRating", 2);
            obj.put( "KnowledgeCustomerKnowledgeRating", 3);
            obj.put("KnowledgeTerritoryKnowledgeRating", 2);
            obj.put("OurValuesDayRating", 5);
            obj.put("OurValuesSuggestedActions", "Good");
            obj.put("OurValuesPassionToGrowRating" ,6);
            obj.put("OurValuesInnovationToExcelRating", 4);
            obj.put("OurValuesCollaborateToWinRating ", 3);
            obj.put("OurValuesIntegrityFirstRating",4 );
            obj.put("OurValuesInnovationRating",5 );
            obj.put("PreInteractionDayRating",4 );
            obj.put("PreInteractionSuggestedActions", "Good");
            obj.put("ProbingDayRating", 3);
            obj.put("ProbingSuggestedActions", "Good");
            obj.put("SellingSkillsDayRating", 5);
            obj.put("SellingSkillsSuggestedActions", "Good");
            obj.put( "SellingSkillsPreCallPlanningRating", 5);
            obj.put( "SellingSkillsOpeningRating", 4);
            obj.put("SellingSkillsExploringRating", 3);
            obj.put("SellingSkillsPresentingRating", 2);
            obj.put("SellingSkillsRespondingRating", 1);
            obj.put("SellingSkillsClosingRating", 5);
            obj.put("SellingSkillsPostCallAnalysisRating", 5);
            obj.put("SettingObjDayRating", 1);
            obj.put("SettingObjSuggestedActions", "Good");
            obj.put("SituationAnalysisDayRating", 1);
            obj.put("SituationAnalysisSuggestedActions", "Good");
            obj.put("ToolsAndResourcesDayRating", 5);
            obj.put("ToolsAndResourcesSuggestedActions", "Good");
            obj.put("Comments", "Good Good Very Good");


        } catch (Exception e){

        }
    }


}
