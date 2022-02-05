package com.example.test.core
import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(item: T)
    abstract fun bind(t: T, onClickListener: (T) -> Unit)
}
