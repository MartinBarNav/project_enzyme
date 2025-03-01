.class public final Landroid/support/v4/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/a/a/a$e;,
        Landroid/support/v4/a/a/a$d;,
        Landroid/support/v4/a/a/a$c;,
        Landroid/support/v4/a/a/a$a;,
        Landroid/support/v4/a/a/a$b;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v4/a/a/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 141
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 142
    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 143
    new-instance v0, Landroid/support/v4/a/a/a$e;

    invoke-direct {v0}, Landroid/support/v4/a/a/a$e;-><init>()V

    sput-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    .line 151
    :goto_0
    return-void

    .line 144
    :cond_0
    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 145
    new-instance v0, Landroid/support/v4/a/a/a$d;

    invoke-direct {v0}, Landroid/support/v4/a/a/a$d;-><init>()V

    sput-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    goto :goto_0

    .line 146
    :cond_1
    const/16 v1, 0xb

    if-lt v0, v1, :cond_2

    .line 147
    new-instance v0, Landroid/support/v4/a/a/a$c;

    invoke-direct {v0}, Landroid/support/v4/a/a/a$c;-><init>()V

    sput-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    goto :goto_0

    .line 149
    :cond_2
    new-instance v0, Landroid/support/v4/a/a/a$a;

    invoke-direct {v0}, Landroid/support/v4/a/a/a$a;-><init>()V

    sput-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    goto :goto_0
.end method

.method public static a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 162
    sget-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    invoke-interface {v0, p0}, Landroid/support/v4/a/a/a$b;->a(Landroid/graphics/drawable/Drawable;)V

    .line 163
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;FF)V
    .locals 1

    .prologue
    .line 204
    sget-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/a/a/a$b;->a(Landroid/graphics/drawable/Drawable;FF)V

    .line 205
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    .prologue
    .line 225
    sget-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/a/a/a$b;->a(Landroid/graphics/drawable/Drawable;I)V

    .line 226
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;IIII)V
    .locals 6

    .prologue
    .line 215
    sget-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Landroid/support/v4/a/a/a$b;->a(Landroid/graphics/drawable/Drawable;IIII)V

    .line 216
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 1

    .prologue
    .line 236
    sget-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/a/a/a$b;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 237
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .prologue
    .line 248
    sget-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/a/a/a$b;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 249
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Z)V
    .locals 1

    .prologue
    .line 178
    sget-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/a/a/a$b;->a(Landroid/graphics/drawable/Drawable;Z)V

    .line 179
    return-void
.end method

.method public static b(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .prologue
    .line 193
    sget-object v0, Landroid/support/v4/a/a/a;->a:Landroid/support/v4/a/a/a$b;

    invoke-interface {v0, p0}, Landroid/support/v4/a/a/a$b;->b(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0
.end method
