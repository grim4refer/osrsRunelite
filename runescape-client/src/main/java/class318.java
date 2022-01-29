import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public final class class318 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILmr;Lkd;I)V",
		garbageValue = "-2060859184"
	)
	static void method5887(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null; // L: 30
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 31
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 32
				if (var5.key == (long)var0 && var1 == var5.archiveDisk && var5.type == 0) { // L: 33
					var3 = var5.data; // L: 34
					break; // L: 35
				}
			}
		}

		if (var3 != null) { // L: 39
			var2.load(var1, var0, var3, true); // L: 40
		} else {
			byte[] var4 = var1.read(var0); // L: 43
			var2.load(var1, var0, var4, true); // L: 44
		}
	} // L: 41 45

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIILfc;Lfq;S)Z",
		garbageValue = "14344"
	)
	public static final boolean method5874(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0; // L: 137
		int var6 = var1; // L: 138
		byte var7 = 64; // L: 139
		byte var8 = 64; // L: 140
		int var9 = var0 - var7; // L: 141
		int var10 = var1 - var8; // L: 142
		class174.directions[var7][var8] = 99; // L: 143
		class174.distances[var7][var8] = 0; // L: 144
		byte var11 = 0; // L: 145
		int var12 = 0; // L: 146
		class174.bufferX[var11] = var0; // L: 147
		int var20 = var11 + 1;
		class174.bufferY[var11] = var1; // L: 148
		int[][] var13 = var4.flags; // L: 149

		while (true) {
			label303:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label280:
							do {
								if (var20 == var12) { // L: 150
									RouteStrategy.field1979 = var5; // L: 269
									class67.field845 = var6; // L: 270
									return false; // L: 271
								}

								var5 = class174.bufferX[var12]; // L: 151
								var6 = class174.bufferY[var12]; // L: 152
								var12 = var12 + 1 & 4095; // L: 153
								var18 = var5 - var9; // L: 154
								var19 = var6 - var10; // L: 155
								var14 = var5 - var4.xInset; // L: 156
								var15 = var6 - var4.yInset; // L: 157
								if (var3.hasArrived(var2, var5, var6, var4)) { // L: 158
									RouteStrategy.field1979 = var5; // L: 159
									class67.field845 = var6; // L: 160
									return true; // L: 161
								}

								var16 = class174.distances[var18][var19] + 1; // L: 163
								if (var18 > 0 && class174.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) { // L: 164 165 166 167
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5 - 1; // L: 171
											class174.bufferY[var20] = var6; // L: 172
											var20 = var20 + 1 & 4095; // L: 173
											class174.directions[var18 - 1][var19] = 2; // L: 174
											class174.distances[var18 - 1][var19] = var16; // L: 175
											break;
										}

										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0) { // L: 169
											break;
										}

										++var17; // L: 168
									}
								}

								if (var18 < 128 - var2 && class174.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) { // L: 177 178 179 180
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5 + 1; // L: 184
											class174.bufferY[var20] = var6; // L: 185
											var20 = var20 + 1 & 4095; // L: 186
											class174.directions[var18 + 1][var19] = 8; // L: 187
											class174.distances[var18 + 1][var19] = var16; // L: 188
											break;
										}

										if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) { // L: 182
											break;
										}

										++var17; // L: 181
									}
								}

								if (var19 > 0 && class174.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) { // L: 190 191 192 193
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5; // L: 197
											class174.bufferY[var20] = var6 - 1; // L: 198
											var20 = var20 + 1 & 4095; // L: 199
											class174.directions[var18][var19 - 1] = 1; // L: 200
											class174.distances[var18][var19 - 1] = var16; // L: 201
											break;
										}

										if ((var13[var17 + var14][var15 - 1] & 19136911) != 0) { // L: 195
											break;
										}

										++var17; // L: 194
									}
								}

								if (var19 < 128 - var2 && class174.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) { // L: 203 204 205 206
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class174.bufferX[var20] = var5; // L: 210
											class174.bufferY[var20] = var6 + 1; // L: 211
											var20 = var20 + 1 & 4095; // L: 212
											class174.directions[var18][var19 + 1] = 4; // L: 213
											class174.distances[var18][var19 + 1] = var16; // L: 214
											break;
										}

										if ((var13[var17 + var14][var15 + var2] & 19137016) != 0) { // L: 208
											break;
										}

										++var17; // L: 207
									}
								}

								if (var18 > 0 && var19 > 0 && class174.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) { // L: 216 217 218
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class174.bufferX[var20] = var5 - 1; // L: 223
											class174.bufferY[var20] = var6 - 1; // L: 224
											var20 = var20 + 1 & 4095; // L: 225
											class174.directions[var18 - 1][var19 - 1] = 3; // L: 226
											class174.distances[var18 - 1][var19 - 1] = var16; // L: 227
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) { // L: 220 221
											break;
										}

										++var17; // L: 219
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class174.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) { // L: 229 230 231
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class174.bufferX[var20] = var5 + 1; // L: 236
											class174.bufferY[var20] = var6 - 1; // L: 237
											var20 = var20 + 1 & 4095; // L: 238
											class174.directions[var18 + 1][var19 - 1] = 9; // L: 239
											class174.distances[var18 + 1][var19 - 1] = var16; // L: 240
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var17 + var14][var15 - 1] & 19136911) != 0) { // L: 233 234
											break;
										}

										++var17; // L: 232
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class174.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) { // L: 242 243 244
									for (var17 = 1; var17 < var2; ++var17) { // L: 245
										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) { // L: 246 247
											continue label280;
										}
									}

									class174.bufferX[var20] = var5 - 1; // L: 249
									class174.bufferY[var20] = var6 + 1; // L: 250
									var20 = var20 + 1 & 4095; // L: 251
									class174.directions[var18 - 1][var19 + 1] = 6; // L: 252
									class174.distances[var18 - 1][var19 + 1] = var16; // L: 253
								}
							} while(var18 >= 128 - var2); // L: 255
						} while(var19 >= 128 - var2);
					} while(class174.directions[var18 + 1][var19 + 1] != 0); // L: 256
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0); // L: 257

				for (var17 = 1; var17 < var2; ++var17) { // L: 258
					if ((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 19136995) != 0) { // L: 259 260
						continue label303;
					}
				}

				class174.bufferX[var20] = var5 + 1; // L: 262
				class174.bufferY[var20] = var6 + 1; // L: 263
				var20 = var20 + 1 & 4095; // L: 264
				class174.directions[var18 + 1][var19 + 1] = 12; // L: 265
				class174.distances[var18 + 1][var19 + 1] = var16; // L: 266
			}
		}
	}
}
