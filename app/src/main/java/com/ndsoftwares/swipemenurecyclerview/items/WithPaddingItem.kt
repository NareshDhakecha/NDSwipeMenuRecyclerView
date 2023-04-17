package com.ndsoftwares.swipemenurecyclerview.items

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.ndsoftwares.swipemenurecyclerview.BaseItem
import com.ndsoftwares.swipemenurecyclerview.databinding.ItemWithPaddingBinding

class WithPaddingItem : BaseItem<ItemWithPaddingBinding>() {

    override fun inflate(inflater: LayoutInflater, parent: ViewGroup): ItemWithPaddingBinding {
        return ItemWithPaddingBinding.inflate(inflater, parent, false)
    }

    override val bindFun = fun (binding: ItemWithPaddingBinding, position: Int) {
        binding.content.text = "With padding $position"
        binding.content.setOnClickListener {
            Toast.makeText(it.context, "With padding $position", Toast.LENGTH_SHORT).show()
        }
        binding.leftMenu.setOnClickListener {
            Toast.makeText(it.context, "LEFT $position", Toast.LENGTH_SHORT).show()
        }
        binding.rightMenu.setOnClickListener {
            Toast.makeText(it.context, "RIGHT $position", Toast.LENGTH_SHORT).show()
        }
    }

}