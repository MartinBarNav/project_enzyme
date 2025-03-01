.class public abstract Lcom/a/a/a/a$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/a/a/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/a/a$a$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/os/IBinder;)Lcom/a/a/a/a;
    .locals 2

    .prologue
    .line 48
    if-nez p0, :cond_0

    .line 49
    const/4 v0, 0x0

    .line 55
    :goto_0
    return-object v0

    .line 51
    :cond_0
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 52
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/a/a/a/a;

    if-eqz v1, :cond_1

    .line 53
    check-cast v0, Lcom/a/a/a/a;

    goto :goto_0

    .line 55
    :cond_1
    new-instance v0, Lcom/a/a/a/a$a$a;

    invoke-direct {v0, p0}, Lcom/a/a/a/a$a$a;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 9

    .prologue
    const/4 v0, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x1

    .line 63
    sparse-switch p1, :sswitch_data_0

    .line 293
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    :goto_0
    return v0

    .line 67
    :sswitch_0
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    move v0, v7

    .line 68
    goto :goto_0

    .line 72
    :sswitch_1
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 74
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 76
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 78
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 79
    invoke-virtual {p0, v0, v1, v2}, Lcom/a/a/a/a$a;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 80
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 81
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    move v0, v7

    .line 82
    goto :goto_0

    .line 86
    :sswitch_2
    const-string v1, "com.android.vending.billing.IInAppBillingService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 88
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 90
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 92
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 94
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_0

    .line 95
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 100
    :cond_0
    invoke-virtual {p0, v1, v2, v3, v0}, Lcom/a/a/a/a$a;->a(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 101
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 102
    if-eqz v0, :cond_1

    .line 103
    invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 104
    invoke-virtual {v0, p3, v7}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    move v0, v7

    .line 109
    goto :goto_0

    .line 107
    :cond_1
    invoke-virtual {p3, v8}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    .line 113
    :sswitch_3
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 117
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 119
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 121
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 123
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    .line 124
    invoke-virtual/range {v0 .. v5}, Lcom/a/a/a/a$a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 125
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 126
    if-eqz v0, :cond_2

    .line 127
    invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 128
    invoke-virtual {v0, p3, v7}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    move v0, v7

    .line 133
    goto/16 :goto_0

    .line 131
    :cond_2
    invoke-virtual {p3, v8}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    .line 137
    :sswitch_4
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 139
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 141
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 143
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 145
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 146
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/a/a/a/a$a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 147
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 148
    if-eqz v0, :cond_3

    .line 149
    invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 150
    invoke-virtual {v0, p3, v7}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    move v0, v7

    .line 155
    goto/16 :goto_0

    .line 153
    :cond_3
    invoke-virtual {p3, v8}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    .line 159
    :sswitch_5
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 161
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 163
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 165
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 166
    invoke-virtual {p0, v0, v1, v2}, Lcom/a/a/a/a$a;->b(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 167
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 168
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    move v0, v7

    .line 169
    goto/16 :goto_0

    .line 173
    :sswitch_6
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 175
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 177
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 179
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 180
    invoke-virtual {p0, v0, v1, v2}, Lcom/a/a/a/a$a;->c(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 181
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 182
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    move v0, v7

    .line 183
    goto/16 :goto_0

    .line 187
    :sswitch_7
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 189
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 191
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 193
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v3

    .line 195
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 197
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 199
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    .line 200
    invoke-virtual/range {v0 .. v6}, Lcom/a/a/a/a$a;->a(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 201
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 202
    if-eqz v0, :cond_4

    .line 203
    invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 204
    invoke-virtual {v0, p3, v7}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_4
    move v0, v7

    .line 209
    goto/16 :goto_0

    .line 207
    :cond_4
    invoke-virtual {p3, v8}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    .line 213
    :sswitch_8
    const-string v1, "com.android.vending.billing.IInAppBillingService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 215
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 217
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 219
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 221
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 223
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 225
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_5

    .line 226
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    move-object v6, v0

    :goto_5
    move-object v0, p0

    .line 231
    invoke-virtual/range {v0 .. v6}, Lcom/a/a/a/a$a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 232
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 233
    if-eqz v0, :cond_6

    .line 234
    invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 235
    invoke-virtual {v0, p3, v7}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_6
    move v0, v7

    .line 240
    goto/16 :goto_0

    :cond_5
    move-object v6, v0

    .line 229
    goto :goto_5

    .line 238
    :cond_6
    invoke-virtual {p3, v8}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    .line 244
    :sswitch_9
    const-string v1, "com.android.vending.billing.IInAppBillingService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 246
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 248
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 250
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 252
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 254
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_7

    .line 255
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    move-object v5, v0

    :goto_7
    move-object v0, p0

    .line 260
    invoke-virtual/range {v0 .. v5}, Lcom/a/a/a/a$a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 261
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 262
    if-eqz v0, :cond_8

    .line 263
    invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 264
    invoke-virtual {v0, p3, v7}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_8
    move v0, v7

    .line 269
    goto/16 :goto_0

    :cond_7
    move-object v5, v0

    .line 258
    goto :goto_7

    .line 267
    :cond_8
    invoke-virtual {p3, v8}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_8

    .line 273
    :sswitch_a
    const-string v1, "com.android.vending.billing.IInAppBillingService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 275
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 277
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 279
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 281
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_9

    .line 282
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 287
    :cond_9
    invoke-virtual {p0, v1, v2, v3, v0}, Lcom/a/a/a/a$a;->b(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    move-result v0

    .line 288
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 289
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    move v0, v7

    .line 290
    goto/16 :goto_0

    .line 63
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x9 -> :sswitch_9
        0xa -> :sswitch_a
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
