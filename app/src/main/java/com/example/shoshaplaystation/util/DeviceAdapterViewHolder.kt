package com.example.trainlivelocation.utli

import androidx.recyclerview.widget.RecyclerView
import com.example.domain.entity.Device
import com.example.domain.entity.DeviceEntity
import com.example.shoshaplaystation.databinding.DevicesRcvItemLayoutBinding

class DeviceAdapterViewHolder(
    private val binding:DevicesRcvItemLayoutBinding,
    private val deviceListener: DeviceListener
) :RecyclerView.ViewHolder(binding.root){
    fun bind(device: DeviceEntity) {
        binding.device = device
        binding.listener=deviceListener

    }
}