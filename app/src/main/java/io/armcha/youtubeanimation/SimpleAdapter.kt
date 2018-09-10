package io.armcha.youtubeanimation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class SimpleAdapter(private val clickListener: View.OnClickListener? = null, private val layoutResId: Int)
    : RecyclerView.Adapter<SimpleAdapter.ViewHolder>() {

    private val items = DataSource.items

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val holder = ViewHolder(LayoutInflater.from(parent.context).inflate(layoutResId, parent, false))
        holder.itemView.setOnClickListener(clickListener)
        return holder
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        Picasso.get()
                .load(item.imageUrl)
                .into(holder.imageView)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageView: ImageView by lazy {
            view.findViewById<ImageView>(R.id.imageView)
        }
    }
}

