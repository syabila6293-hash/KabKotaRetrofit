package com.example.kabkotaretrofitapp.response

import com.google.gson.annotations.SerializedName
import com.example.kabkotaretrofitapp.model.KabKotaItem

data class KabKotaResponse(

	@field:SerializedName("data")
	val data: List<KabKotaItem>,

	@field:SerializedName("message")
	val message: String
)

data class DataItem(

	@field:SerializedName("kabupaten_kota")
	val kabupatenKota: String,

	@field:SerializedName("jumlah_penduduk")
	val jumlahPenduduk: Int,

	@field:SerializedName("tanggal_berdiri")
	val tanggalBerdiri: String,

	@field:SerializedName("jumlah_kecamatan")
	val jumlahKecamatan: Int,

	@field:SerializedName("bupati_walikota")
	val bupatiWalikota: String,

	@field:SerializedName("pusat_pemerintahan")
	val pusatPemerintahan: String,

	@field:SerializedName("url_peta_wilayah")
	val urlPetaWilayah: String,

	@field:SerializedName("logo")
	val logo: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("deskripsi")
	val deskripsi: String,

	@field:SerializedName("jumlah_kelurahan")
	val jumlahKelurahan: Int,

	@field:SerializedName("luas_wilayah")
	val luasWilayah: Any,

	@field:SerializedName("jumlah_desa")
	val jumlahDesa: Int
)
