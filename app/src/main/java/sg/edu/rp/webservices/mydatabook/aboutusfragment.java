package sg.edu.rp.webservices.mydatabook;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.net.URL;

public class aboutusfragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView ivRPLogo;

    public aboutusfragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static aboutusfragment newInstance(String param1, String param2) {
        aboutusfragment fragment = new aboutusfragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        ivRPLogo.findViewById(R.id.ivRPLogo);

        try {
            URL thumb_u = new URL("https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg");
            Drawable thumb_d = Drawable.createFromStream(thumb_u.openStream(), "src");
            ivRPLogo.setImageDrawable(thumb_d);
        }
        catch (Exception e) {
            // handle it
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.aboutusfragment, container, false);
    }
}