package singh.betterfit;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.RecyclerHolder> {

    List<String> names;
    List<Integer> images;
    List<String> descriptions;
    Context context;

    public RecylerAdapter(Context c, List<String> names, List<Integer> images, List<String> descriptions) {
        this.context = c;
        this.names = names;
        this.images = images;
        this.descriptions = descriptions;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        holder.name.setText(names.get(position));
        holder.image.setImageResource(images.get(position));
        holder.description.setText(descriptions.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView image;
        TextView description;

        RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_row);
            image = itemView.findViewById(R.id.image_row);
            description = itemView.findViewById(R.id.description_row);
        }

    }
}
