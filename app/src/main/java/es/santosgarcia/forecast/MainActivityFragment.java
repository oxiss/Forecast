package es.santosgarcia.forecast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String tiempo[] = {
                "Hoy - soleado - 19-30",
                "Mañana - nublado - 15-16",
                "Jueves - Tormenta - 14-15",
                "Viernes - Tormenta - 14-15",
                "Sabado - Soleado - 14-15",
                "Domingo - Tormenta - 14-15",
                "Lunes - Nublado - 14-15"

        };

        List<String> mitiempo = new ArrayList<>(Arrays.asList(tiempo));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                        getActivity(),
                        android.R.layout.expandable_list_content,
                        R.id.list_item_forecast_textview,
                        mitiempo);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(listViewForecast);
                            listView.setAdapter(adapter);
                            return rootView;


    }

}
