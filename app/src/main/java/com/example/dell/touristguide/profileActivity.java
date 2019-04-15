package com.example.dell.touristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class profileActivity extends AppCompatActivity{

    Button button;
    int click=0;
    int bd;
    int pos;
    int state=0;

    TextView textView,textView2;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        textView = findViewById(R.id.detailsTextViewId);
        textView2=(TextView)findViewById(R.id.touristspot);

        button=(Button)findViewById(R.id.touristspot);
        linearLayout=(LinearLayout)findViewById(R.id.linearlayout);
        Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        pos = intent.getIntExtra("pos",0);
        textView.setText(name);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pos == 0)
                {   textView2.setText("Spots");
                    state++;
                    linearLayout.setBackgroundResource(R.drawable.aus);
                    textView.setText(R.string.australia);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            state++;
                            textView2.setText("Tourist Site");
                            textView.setText(R.string.aussiespots);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    state++;
                                    textView2.setText("Travel Hotels");
                                    textView.setText(R.string.aussietravelsite);
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            state++;
                                            textView2.setText("Return");
                                            // button.setId(null);
                                            textView.setText(R.string.aussiehotels);
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    finish();
                                                    System.exit(0);
                                                }
                                            });

                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                else if(pos == 1 ){
                    textView2.setText("Spots");
                    linearLayout.setBackgroundResource(R.drawable.bd);
                    textView.setText(R.string.bangladesh);
                   // bd=1;
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Tourist Site");
                            textView.setText(R.string.bdTouristSpot);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                        textView2.setText("Travel Hotels");
                                    textView.setText(R.string.bdtravelsite);
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            textView2.setText("Return");
                                           // button.setId(null);
                                            textView.setText(R.string.bdhotels);
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    finish();
                                                    System.exit(0);
                                                }
                                            });


                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                else if(pos == 2){
                    textView2.setText("Spots");
                    linearLayout.setBackgroundResource(R.drawable.canada);
                    textView.setText(R.string.canada);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Tourist Site");
                            textView.setText(R.string.canadaspots);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    textView2.setText("Travel Hotels");
                                    textView.setText(R.string.canadatravelsite);
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            textView2.setText("Return");
                                            // button.setId(null);
                                            textView.setText(R.string.canadahotels);
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    finish();
                                                    System.exit(0);
                                                }
                                            });

                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                else if(pos == 3){
                    textView2.setText("Spots");
                    linearLayout.setBackgroundResource(R.drawable.den);
                    textView.setText(R.string.denmark);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Tourist Site");
                            textView.setText(R.string.denmarkspots);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    textView2.setText("Travel Hotels");
                                    textView.setText(R.string.denmarktravelsite);
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            textView2.setText("Return");
                                            // button.setId(null);
                                            textView.setText(R.string.denmarkhotels);
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    finish();
                                                    System.exit(0);
                                                }
                                            });

                                        }
                                    });
                                }
                            });
                        }
                    });
                    ;
                }
                else if(pos ==4){
                    textView2.setText("Spots");
                    linearLayout.setBackgroundResource(R.drawable.egpt1);
                    textView.setText(R.string.egypt);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Tourist Site");
                            textView.setText(R.string.egyptspots);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    textView2.setText("Travel Hotels");
                                    textView.setText(R.string.egypttravelsite);
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            textView2.setText("Return");
                                            // button.setId(null);
                                            textView.setText(R.string.egypthotelss);
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    finish();
                                                    System.exit(0);
                                                }
                                            });

                                        }
                                    });
                                }
                            });
                        }
                    });


                }
                else if(pos == 5){
                    textView2.setText("Spots");
                    linearLayout.setBackgroundResource(R.drawable.india);
                    textView.setText(R.string.india);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Tourist Site");
                            textView.setText(R.string.indiaspots);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    textView2.setText("Travel Hotels");
                                    textView.setText(R.string.indiatravelsite);
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            textView2.setText("Return");
                                            // button.setId(null);
                                            textView.setText(R.string.indiahotels);
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    finish();
                                                    System.exit(0);
                                                }
                                            });

                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                else if(pos == 6){
                    textView2.setText("Spots");
                    linearLayout.setBackgroundResource(R.drawable.malay);
                    textView.setText(R.string.malaysia);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Tourist Site");
                            textView.setText(R.string.malaysiaspots);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    textView2.setText("Travel Hotels");
                                    textView.setText(R.string.malaysiatravelsite);
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            textView2.setText("Return");
                                            // button.setId(null);
                                            textView.setText(R.string.malaysiahotelss);
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    finish();
                                                    System.exit(0);
                                                }
                                            });

                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                else if(pos == 7){
                    textView2.setText("Spots");
                    linearLayout.setBackgroundResource(R.drawable.newz);
                    textView.setText(R.string.newzwaland);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Tourist Site");
                            textView.setText(R.string.newzealandspots);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    textView2.setText("Travel Hotels");
                                    textView.setText(R.string.newzealandtravelsite);
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            textView2.setText("Return");
                                            // button.setId(null);
                                            textView.setText(R.string.newzealandhotels);
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    finish();
                                                    System.exit(0);
                                                }
                                            });

                                        }
                                    });
                                }
                            });
                        }
                    });

                }
                else if(pos == 8){
                    textView2.setText("Spots");
                    linearLayout.setBackgroundResource(R.drawable.qatar);
                    textView.setText(R.string.qatar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Tourist Site");
                            textView.setText(R.string.qatarspots);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    textView2.setText("Travel Hotels");
                                    textView.setText(R.string.qatartravelsite);
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            textView2.setText("Return");
                                            // button.setId(null);
                                            textView.setText(R.string.qatarhotels);
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    finish();
                                                    System.exit(0);
                                                }
                                            });

                                        }
                                    });
                                }
                            });
                        }
                    });
                }
                else if(pos == 9){
                    textView2.setText("Spots");
                    linearLayout.setBackgroundResource(R.drawable.sri);
                    textView.setText(R.string.srilanka);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Tourist Site");
                            textView.setText(R.string.srilankaspots);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    textView2.setText("Travel Hotels");
                                    textView.setText(R.string.srilankatravelsite);
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            textView2.setText("Return");
                                            // button.setId(null);
                                            textView.setText(R.string.srilankahotels);
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    finish();
                                                    System.exit(0);
                                                }
                                            });

                                        }
                                    });
                                }
                            });
                        }
                    });

                }



            }
        });


    }


}
